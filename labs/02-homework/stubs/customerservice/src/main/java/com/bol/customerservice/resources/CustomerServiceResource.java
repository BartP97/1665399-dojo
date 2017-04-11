package com.bol.customerservice.resources;

import com.bol.customerservice.api.Customer;
import com.bol.customerservice.api.CustomerList;
import com.bol.customerservice.jdbi.CustomerDao;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

@Path("/v1")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class CustomerServiceResource {
    private final CustomerDao customerDao;

    public CustomerServiceResource(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @GET
    @Path("customer")
    @Timed
    public CustomerList getCustomers() {
        CustomerList customerList = new CustomerList();
        customerList.setCustomers(customerDao.getCustomers());
        return customerList;
    }

    @GET
    @Path("customer/{customerNumber}")
    @Timed
    public Customer getCustomer(@PathParam("customerNumber") Long customerNumber) {
        return customerDao.getCustomer(customerNumber)
                .orElseThrow(() -> new WebApplicationException(Status.NOT_FOUND));
    }
}
