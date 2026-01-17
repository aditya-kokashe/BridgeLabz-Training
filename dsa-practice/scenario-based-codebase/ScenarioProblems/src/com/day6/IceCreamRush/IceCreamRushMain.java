package com.day6.IceCreamRush;

public class IceCreamRushMain {
	public static void main(String[] args) {
	
		Flavor[] flavors = {
				new Flavor("A", 120),
				new Flavor("B", 200),
				new Flavor("C", 80),
				new Flavor("D", 180),
				new Flavor("E", 150),
				new Flavor("F", 100),
				new Flavor("G", 110),
				new Flavor("H", 200),
				
		};
		
		System.out.println("Before sorting -> ");
		for(Flavor f : flavors) {
			System.out.println(f.flavor + " : " + f.sales);
		}
		
		BubbleSort.sort(flavors);
		
		System.out.println("\nAfter sorting ->");
		for(Flavor f : flavors) {
			System.out.println(f.flavor + " : " + f.sales);
		}
		
	}
}
