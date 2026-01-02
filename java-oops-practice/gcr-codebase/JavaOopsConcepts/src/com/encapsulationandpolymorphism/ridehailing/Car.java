package com.encapsulationandpolymorphism.ridehailing;

public class Car extends Vehicle implements GPS {

    public Car(String id, String driver, double rate, String loc) {
        super(id, driver, rate, loc);
    }

    //Abstract method override
    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;	 //standard rate
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
