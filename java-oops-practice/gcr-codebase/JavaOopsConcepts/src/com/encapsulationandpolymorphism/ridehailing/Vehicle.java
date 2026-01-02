package com.encapsulationandpolymorphism.ridehailing;

public abstract class Vehicle {

    private String vehicleId;
    private String driverName;
    protected double ratePerKm;
    private String currentLocation;   //sensitive encapsulated

    public Vehicle(String vehicleId, String driverName, double ratePerKm, String location) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = location;
    }

    //Encapsulation
    public String getVehicleId() {
        return vehicleId;
    }
    public String getDriverName() {
        return driverName;
    }

    protected void setCurrentLocation(String loc) {
        this.currentLocation = loc;
    }
    public String getLocation() {
        return currentLocation;
    }
    

    //Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver: " + driverName);
        System.out.println("Rate Per Km: " + ratePerKm);
        System.out.println("Location: " + currentLocation);
    }

    //Abstract method
    public abstract double calculateFare(double distance);
}
