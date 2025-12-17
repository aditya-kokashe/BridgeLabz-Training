//Write a program the find the distance in yards and miles for the distance provided by user in feets

import java.util.Scanner;
public class DistanceConverterFeet{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		//Take input distance in feet
		System.out.print("Enter distance in feet: ");
		double distanceInFeet = input.nextDouble();
		//Convert feet to yards 1 yard equals 3 feet
		double yards = distanceInFeet / 3;
		//Convert yards to miles 1 mile equals 1760 yards
		double miles = yards / 1760;

		//Display the distance in yards and miles
		System.out.println("Distance in yards is " + yards + " and distance in miles is " + miles);
	}
}
