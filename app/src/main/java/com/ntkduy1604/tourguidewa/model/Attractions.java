package com.ntkduy1604.tourguidewa.model;

import android.graphics.drawable.Drawable;

/**
 * Created by NTKDUY on 6/20/2018
 * for PIGGY HOUSE
 * you can contact me at: ntkduy1604@gmail.com
 */
public class Attractions {
    private final String name;
    private final String info;
    private final Drawable imageDrawable;

    public Attractions(String name, String info, Drawable imageDrawable) {
        this.name = name;
        this.info = info;
        this.imageDrawable = imageDrawable;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public Drawable getImageDrawable() {
        return imageDrawable;
    }

    public boolean hasImage() {
        return imageDrawable != null;
    }

}
