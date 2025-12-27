package com.constructor.levelone;

public class HotelBooking {
	//Attributes
	String guestName;
	String roomType;
	int nights;
	
	//Default constructor
	public HotelBooking() {
		guestName = "Aman";
		roomType = "Regular";
		nights = 2;
	}

	//parameterized constructor
	public HotelBooking(String guestName, String roomType, int nights) {
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	//Copy constructor
	public HotelBooking(HotelBooking previousBooking) {
		this.guestName = previousBooking.guestName;
		this.roomType = previousBooking.roomType;
		this.nights = previousBooking.nights;
	}
	
	//Display Booking details
	public void bookingDetails() {
		System.out.println("Guest Name: "+ guestName);
		System.out.println("Room Type: "+ roomType);
		System.out.println("Nights: "+ nights);
		System.out.println("--------------------------------");
	}
}
