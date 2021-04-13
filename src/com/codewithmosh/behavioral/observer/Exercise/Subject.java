package com.codewithmosh.behavioral.observer.Exercise;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer obs){
        observers.add(obs);
    }

    public void removeObserver(Observer obs){
        observers.remove(obs);
    }

    public void notifyObservers(){
        for (var obs: observers){
            obs.update();
        }
    }
}
