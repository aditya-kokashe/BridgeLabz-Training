package com.day7.Artify;

public class Artwork {

	protected String title;
	protected String artist;
	protected double price;
	protected String licenseType;
	
	public Artwork(String title, String artist, double price, String type) {
		this.licenseType = type;
		this.artist= artist;
		this.price = price;
		this.title= title;
	}
	
	public String getArtDetails() {
		return "\nTitle: "+title+"\nArtist: "+artist+"\nPrice: "+price+"\nLicense Type: "+licenseType;
	}
	
	public void displayInfo() {
		System.out.println(getArtDetails());
	}

}
