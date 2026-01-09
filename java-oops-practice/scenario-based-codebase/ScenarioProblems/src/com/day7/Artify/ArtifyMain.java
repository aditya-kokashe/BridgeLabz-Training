package com.day7.Artify;

public class ArtifyMain {

	public static void main(String[] args) {
		User user = new User("Abhishek", 2500);
		user.displayUser();
		
		Artwork art1 = new DigitalArt("Bouant Scape", "Baudhsen Mishra", 5500.0, "licenseOne");
		Artwork art2 = new PrintArt("Senic Motion", "Jeorge Martin", 1200.0, "licenseTwo");
		
		Artwork[] artworks = {art1, art2};
		
		for(Artwork art: artworks) {
			art.displayInfo();
			if(art instanceof IPurchasable) {
				IPurchasable m = (IPurchasable) art;
				m.purchase(user);
				m.license();
			}
		}
	}
}
