package com.codewithmosh.behavioral.state.Exercise;

public class TravelByWalking extends TravelBy{
    private TravelMode mode = TravelMode.WALKING;

    @Override
    public int getEta() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }

    @Override
    public TravelMode getMode() {
        return mode;
    }
}
