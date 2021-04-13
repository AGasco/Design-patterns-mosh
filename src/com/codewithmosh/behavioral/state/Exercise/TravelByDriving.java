package com.codewithmosh.behavioral.state.Exercise;

public class TravelByDriving extends TravelBy{
    private TravelMode mode = TravelMode.DRIVING;

    @Override
    public int getEta() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }

    @Override
    public TravelMode getMode() {
        return mode;
    }
}
