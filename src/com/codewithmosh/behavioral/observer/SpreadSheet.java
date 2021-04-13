package com.codewithmosh.behavioral.observer;

public class SpreadSheet implements Observer{
    //Pull style
    //private int value;
    //@Override
    //public void update(int value) {
    //    this.value = value;
    //    System.out.println("Spreadsheet got notified");
    //}



    //Push style
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public void update() {
        var value = dataSource.getValue();
        System.out.println("Spreadsheet got notified" + value);
    }
}
