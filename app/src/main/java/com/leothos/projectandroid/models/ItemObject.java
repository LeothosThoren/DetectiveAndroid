package com.leothos.projectandroid.models;

public class ItemObject {
    private String itemName;
    private String itemDescription;
    private int itemImage;
    private int visibility;

    public ItemObject(String itemName, String itemDescription, int itemImage) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemImage = itemImage;
    }

    public ItemObject() {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getItemImage() {
        return itemImage;
    }

    public void setItemImage(int itemImage) {
        this.itemImage = itemImage;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

}
