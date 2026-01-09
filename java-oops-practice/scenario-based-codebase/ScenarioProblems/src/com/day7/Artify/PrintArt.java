package com.day7.Artify;

public class PrintArt extends Artwork implements IPurchasable{

	public PrintArt(String title, String artist, double price, String type) {
		super(title, artist, price, type);
	}

	@Override
	public double purchase(User user) {
		if(user.getWalletBalance() >= price) {
			double updatedPrice = user.getWalletBalance()- price;
			user.setWalletBalance(updatedPrice);
			System.out.println("Balance after Purchase: "+updatedPrice);
			return updatedPrice;
		}else {
			System.out.println("Insufficient Balance");
			return user.getWalletBalance();
		}
		
	}

	@Override
	public void license() {
		System.out.println("One-time print license");
	}

}
