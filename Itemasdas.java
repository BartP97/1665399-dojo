package org.joyofcoding.objectcalisthenics;

public class Itemasdas implements Item {
    private String name;
    private int sellIn;
    private int quality;

    public Itemasdas(String name, int sellIn, int quality) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    @Override
    public void decreaseQuality() {
        this.quality = this.quality - 1;
    }

    @Override
    public void increaseQuality() {
        this.quality = this.quality + 1;
    }

    @Override
    public void updateItemQuality(){
        if (!this.name.equals("Aged Brie" )
                && !this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (this.quality > 0) {
                if (!this.name.equals("Sulfuras, Hand of Ragnaros")) {
                    decreaseQuality();
                }
            }
        } else {
            if (this.quality < 50) {
                increaseQuality();

                if (this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if ( this.sellIn < 11) {
                        if (this.quality < 50) {
                            increaseQuality();
                        }
                    }

                    if ( this.sellIn < 6) {
                        if (this.quality < 50) {
                            increaseQuality();
                        }
                    }
                }
            }
        }

        if (!this.name.equals("Sulfuras, Hand of Ragnaros")) {
            this.sellIn = (this.sellIn - 1);
        }

        if ( this.sellIn < 0) {
            if (!this.name.equals("Aged Brie")) {
                if (!this.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (this.quality > 0) {
                        if (!this.name.equals("Sulfuras, Hand of Ragnaros")) {
                            decreaseQuality();
                        }
                    }
                } else {
                    this.quality = (this.quality - this.quality);
                }
            } else {
                if (this.quality < 50) {
                    increaseQuality();
                }
            }
        }
    }


}
