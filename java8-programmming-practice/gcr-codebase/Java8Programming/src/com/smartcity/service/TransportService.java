package com.smartcity.service;

public interface TransportService {

    String getServiceName();
    double getFare();
    String getRoute();
    int getDepartureTime(); // minutes from 00:00

    default void printServiceDetails() {
        System.out.println(
            getServiceName() + " | Route: " + getRoute() + 
            " | Fare: ₹" + getFare()
        );
    }
}
