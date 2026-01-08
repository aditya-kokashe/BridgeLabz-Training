package com.day6.TourMate;

public class TourMateMain {
    public static void main(String[] args) {

        Transport t = new Transport(5000);
        Hotel h = new Hotel(8000);
        Activity a = new Activity(2000);

        Trip trip1 = new DomesticTrip("Goa", 4, t, h, a);
        trip1.book();

        System.out.println();

        Trip trip2 = new InternationalTrip("Dubai", 5, t, h, a);
        trip2.book();
    }
}
