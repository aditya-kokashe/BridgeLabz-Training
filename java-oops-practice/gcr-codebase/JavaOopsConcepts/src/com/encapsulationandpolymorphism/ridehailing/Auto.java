package com.encapsulationandpolymorphism.ridehailing;

public class Auto extends Vehicle implements GPS {

    public Auto(String id, String driver, double rate, String loc) {
        super(id, driver, rate, loc);
    }

    //Abstract method override
    @Override
    public double calculateFare(double distance) {
        return (distance * ratePerKm) + 20; 	   //fixed base charge
    }

    //Interface method override
    @Override
    public String getCurrentLocation() {
        return getLocation();
    }
    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}
