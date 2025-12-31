/*
Bus Route Distance Tracker 
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.
*/

import java.util.Scanner;
public class BusRouteTracker{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int totalDistance = 0;
		System.out.println("\n Bus Route Distance Tracker");
		
		//Calculate total distance
		while(true){
			totalDistance += 5;		//Stops are at every 5 km
			
			//Take input if user want to get off
			System.out.print("\n Do you want to get off? (yes/no): ");
			String getOff = sc.next().toLowerCase();
			
			//Exit condition
			if(getOff.equals("yes")){
				System.out.println("\n Total distance: "+ totalDistance+" km");
				System.out.println(" Thankyou for visiting!");
				break;
			}
		}
	}
}