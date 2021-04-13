package com.codewithmosh.structural.adapter;

import com.codewithmosh.structural.adapter.avaFilters.Caramel;

public class Demo {
    public static void show(){
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
