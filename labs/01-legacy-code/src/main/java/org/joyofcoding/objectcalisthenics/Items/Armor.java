package org.joyofcoding.objectcalisthenics.Items;

/**
 * Created by bart-_000 on 27-3-2017.
 */
public class Armor implements Item {
    //Vest
    private String name;
    private int sellIn;
    private int quality;

    public Armor(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public int getSellIn() {
        return sellIn;
    }

    @Override
    public int getQuality() {
        return quality;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void decreaseQuality(int amount) {
        this.quality = this.quality - amount;
    }

    @Override
    public void increaseQuality(int amount) {
        this.quality = this.quality + amount;
    }

    @Override
    public void updateItemQuality() {
        if (this.quality > 0) {
            decreaseQuality(1);
        }
        decreaseSellIn(1);
        if (this.sellIn < 0 && quality > 0) {
            decreaseQuality(1);
        }
    }

    @Override
    public void decreaseSellIn(int amount) {
        this.sellIn = this.sellIn - amount;
    }

    @Override
    public void increaseSellIn(int amount) {
        this.sellIn = this.sellIn + amount;
    }
}
