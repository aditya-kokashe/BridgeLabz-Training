package com.constructor.levelone;

public class HotelBookingMain {

	public static void main(String[] args) {
		
		//Default Constructor
		HotelBooking booking1 = new HotelBooking();
		System.out.println("Booking 1: ");
		booking1.bookingDetails();
		
		//Parameterized constructor
		HotelBooking booking2 = new HotelBooking("Arvind", "Non AC", 1);
		System.out.println("Booking 2: ");
		booking2.bookingDetails();
		
		//Copy constructor
		HotelBooking booking3 = new HotelBooking(booking2);
		System.out.println("Booking 3: ");
		booking3.bookingDetails();
		
	}
}
