package com.codewithmosh.behavioral.observer;

public class DataSource extends Subject{
    private int value;


    public int getValue() {
        return value;
    }

    //Push style
/*    public void setValue(int value) {
        this.value = value;
        notifyObservers(value);
    }*/

    //Pull style
    public void setValue(int value){
        this.value = value;
        notifyObservers();
    }

}
