package com.day2.CabbyGo;

public class CabbyGoMain {

	public static void main(String[] args) {
		
		Vehicle v1 = new Mini(10215, 0, null, 0, 0, "Bhopal");
		Vehicle v2 = new SUV(52632, 0, null, 0, 0, "Ujjain");
		Vehicle v3 = new Sedan(78545, 0, null, 0, 0, "Mumbai");

		Driver d = new Driver("Allu Arjun", 120215, 8);
		d.display();
		
		Vehicle[] vehicles = {v1,v2,v3};
		
		for(Vehicle v : vehicles) {
			if (v instanceof IRideService) {
				
				v.display();
				System.out.println("+-------------------------+");
				System.out.println("Total fare is: "+ v.calculateFare(5));
				System.out.println(((IRideService) v).bookRide());
			}
		}	
		System.out.println(((IRideService) v1).endRide());
		System.out.println(((IRideService) v2).endRide());
		System.out.println(((IRideService) v3).endRide());

	}
}
