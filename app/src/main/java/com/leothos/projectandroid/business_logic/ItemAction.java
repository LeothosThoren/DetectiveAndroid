package com.leothos.projectandroid.business_logic;

import com.leothos.projectandroid.models.DataClass;
import com.leothos.projectandroid.models.ItemObject;

public interface ItemAction {

    default void takeItem(ItemObject item) {
        DataClass.getInstance().listOfItem.add(item);
    }

    default void dropItem(int itemIndex) {
        DataClass.getInstance().listOfItem.remove(itemIndex);
    }

    default ItemObject useItem(int itemIndex) {
        return DataClass.getInstance().listOfItem.get(itemIndex);
    }

    default boolean checkItem(String name) {
        for (ItemObject item : DataClass.getInstance().listOfItem) {
            if (item.getItemName().contains(name)) {
                return true;
            }
        }
        return false;
    }
}
