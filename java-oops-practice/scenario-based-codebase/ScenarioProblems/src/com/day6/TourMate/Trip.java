package com.day6.TourMate;

public class Trip implements IBookable {

    protected String destination;
    protected int duration;
    protected double budget;

    protected Transport transport;
    protected Hotel hotel;
    protected Activity activity;

    public Trip(String destination, int duration, Transport transport, Hotel hotel, Activity activity) {
        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;

        //Operator used to calculate total budget
        this.budget = transport.getCost() + hotel.getCost() + activity.getCost();
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public void book() {
        System.out.println("Trip booked to " + destination);
    }

    @Override
    public void cancel() {
        System.out.println("Trip cancelled.");
    }
}
