package com.codewithmosh.state.Exercise;

public class DirectionService {
    private TravelBy travelMode;

    public Object getEta() {
        return travelMode.getEta();
    }

    public Object getDirection() {
        return travelMode.getDirection();
    }

    public TravelBy getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelBy travelMode) {
        this.travelMode = travelMode;
    }
}
