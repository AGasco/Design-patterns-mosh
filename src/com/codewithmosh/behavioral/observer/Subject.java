package com.codewithmosh.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// Also called "observable" or "publisher"
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer obs){
        observers.add(obs);
    }

    public void removeObserver(Observer obs){
        observers.remove(obs);
    }


    //Push style
/*    public void notifyObservers(int value){
        for (var obs: observers){
            obs.update(value);
        }
    }*/

    //Pull style
    public void notifyObservers(){
        for (var obs: observers){
            obs.update();
        }}
}
