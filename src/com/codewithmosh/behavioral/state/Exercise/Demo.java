package com.codewithmosh.behavioral.state.Exercise;

public class Demo {
   public static void show(){
       var directionService =  new DirectionService();

       // Driving
       directionService.setTravelMode(new TravelByDriving());
       directionService.getEta();
       directionService.getDirection();

       // Bicycling
       directionService.setTravelMode(new TravelByBicycle());
       directionService.getEta();
       directionService.getDirection();

       // Transit
       directionService.setTravelMode(new TravelByTransit());
       directionService.getEta();
       directionService.getDirection();

       // Walking
       directionService.setTravelMode(new TravelByWalking());
       directionService.getEta();
       directionService.getDirection();
   }
}
