package com.day4.EventEase;

public class BirthdayEvent extends Event {

    private double venueCost;
    private double serviceCost;
    private double discount;

    public BirthdayEvent(String eventName, String location, String date, int attendees,
                         User organizer, double venueCost, double serviceCost, double discount) {
        super(eventName, location, date, attendees, organizer);
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    private double calculateCost() {
        return venueCost + serviceCost - discount;   // operator usage
    }

    public void schedule() {
        System.out.println("Birthday scheduled on " + date);
        System.out.println("Total Cost : " + calculateCost());
    }

    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday rescheduled to " + newDate);
    }

    public void cancel() {
        System.out.println("Birthday Event cancelled.");
    }
}
