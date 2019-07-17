package com.leothos.projectandroid.business_logic;

import android.content.Context;

import com.leothos.projectandroid.models.DataClass;
import com.leothos.projectandroid.models.ItemList;

public interface ItemAction {

    default void takeItem(ItemList item) {
        DataClass.getInstance().listOfItem.add(item);
    }

    default void dropItem(int itemIndex) {
        DataClass.getInstance().listOfItem.remove(itemIndex);
    }

    default ItemList useItem(int itemIndex) {
        return DataClass.getInstance().listOfItem.get(itemIndex);
    }

    default boolean checkItem(Context context, String name) {
        for (ItemList item : DataClass.getInstance().listOfItem) {
            if (transformIntResourceIntoString(context, item.getName()).contains(name)) {
                return true;
            }
        }
        return false;
    }

    default String transformIntResourceIntoString(Context context, int name) {
        return context.getResources().getString(name);
    }

}
