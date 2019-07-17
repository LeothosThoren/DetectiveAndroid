package com.leothos.projectandroid.models;

import java.util.ArrayList;

public class DataClass {

    private static final DataClass ourInstance = new DataClass();
    public ArrayList<ItemList> listOfItem = new ArrayList<>();

    private DataClass() {
    }

    public static DataClass getInstance() {
        return ourInstance;
    }
}
