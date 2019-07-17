package com.leothos.projectandroid.models;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

import com.leothos.projectandroid.R;

public enum ItemList {

    PISTOL(R.string.pistol_name, R.string.pistol_description, R.drawable.ic_pistol),
    FLUTE(R.string.flute_name, R.string.flute_description, R.drawable.ic_pistol),
    KEY(R.string.key_name, R.string.key_description, R.drawable.ic_pistol),
    SOAP(R.string.soap_name, R.string.soap_description, R.drawable.ic_pistol),
    HAMMER(R.string.hammer_name, R.string.pistol_description, R.drawable.ic_pistol),
    PAPER(R.string.paper_name, R.string.paper_description, R.drawable.ic_pistol);


    private int name;
    private int description;
    private int drawable;

    ItemList(@StringRes int name, @StringRes int description, @DrawableRes int drawable) {
        this.name = name;
        this.description = description;
        this.drawable = drawable;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }
}
