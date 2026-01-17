package com.day6.IceCreamRush;

public class BubbleSort {

	public static void sort(Flavor[] flavors) {
		for(int i=0; i<flavors.length-1; i++) {
			for(int j=0 ; j<flavors.length -i-1; j++) {
				
				if(flavors[j].sales > flavors[j+1].sales) {
					
					Flavor temp = flavors[j];
					flavors[j] = flavors[j+1];
					flavors[j+1] = temp;
				}
			}
		}
	}	
}
