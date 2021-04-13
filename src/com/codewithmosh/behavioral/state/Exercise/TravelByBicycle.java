package com.codewithmosh.behavioral.state.Exercise;

public class TravelByBicycle extends TravelBy{
    private TravelMode mode = TravelMode.BICYCLING;

    @Override
    public int getEta() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }

    public TravelMode getMode() {
        return mode;
    }
}
