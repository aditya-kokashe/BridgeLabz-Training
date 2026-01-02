package com.encapsulationandpolymorphism.ridehailing;

public class Bike extends Vehicle implements GPS {

    public Bike(String id, String driver, double rate, String loc) {
        super(id, driver, rate, loc);
    }

    //Abstract method override
    @Override
    public double calculateFare(double distance) {
        return (distance * ratePerKm) * 0.8; 	   //cheaper
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
