package com.codewithmosh.behavioral.state.Exercise;

public class TravelByTransit extends TravelBy{
    private TravelMode mode = TravelMode.TRANSIT;

    @Override
    public int getEta() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }

    @Override
    public TravelMode getMode() {
        return mode;
    }
}
