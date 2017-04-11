package org.joyofcoding.objectcalisthenics.Items;

/**
 * Created by bart-_000 on 27-3-2017.
 */
public interface Item {
    void decreaseQuality(int amount);

    void increaseQuality(int amount);

    void updateItemQuality();

    void decreaseSellIn(int amount);

    void increaseSellIn(int amount);

    int getQuality();

    String getName();

    int getSellIn();


}
