package com.codewithmosh.observer;

public class Chart implements Observer{
    //Push style
/*    private int value;

    @Override
    public void update(int value) {
        this.value=value;
        System.out.println("Chart got notified");
    }*/

    //Pull style
    private DataSource dataSource;

    public Chart(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Override
    public void update(){
        var value = dataSource.getValue();
        System.out.println("Chart got notified" + value);
    }
}
