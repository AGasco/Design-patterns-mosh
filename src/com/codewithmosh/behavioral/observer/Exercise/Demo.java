package com.codewithmosh.behavioral.observer.Exercise;

public class Demo {
    public static void show(){
        var stock1 = new Stock("pepaso", 15);
        var stock2 = new Stock("jaime", 20);

        var stockListView = new StockListView();
        var statusBar = new StatusBar();
        stockListView.addStock(stock1);
        statusBar.addStock(stock2);

        stock1.addObserver(stockListView);
        stock2.addObserver(statusBar);

        stock1.setPrice(12);
        stock2.setPrice(10);
    }
}
