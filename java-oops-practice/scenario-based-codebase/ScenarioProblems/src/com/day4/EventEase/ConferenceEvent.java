package com.day4.EventEase;

public class ConferenceEvent extends Event {

    private double venueCost;
    private double serviceCost;
    private double discount;

    public ConferenceEvent(String eventName, String location, String date, int attendees,
                           User organizer, double venueCost, double serviceCost, double discount) {
        super(eventName, location, date, attendees, organizer);
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    private double calculateCost() {
        return venueCost + serviceCost - discount;
    }

    public void schedule() {
        System.out.println("\nConference scheduled on " + date);
        System.out.println("Total Cost : " + calculateCost());
    }

    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference rescheduled to " + newDate);
    }

    public void cancel() {
        System.out.println("Conference Event cancelled");
    }
}
