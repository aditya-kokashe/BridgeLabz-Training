package com.day6.TourMate;

public class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration, Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("Domestic trip booked within India to " + destination);
        System.out.println("Total Budget: " + budget);
    }
}
