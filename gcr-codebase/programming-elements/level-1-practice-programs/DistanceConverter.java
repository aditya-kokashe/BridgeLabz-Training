//Create a program to convert distance in kilometers to miles.

import java.util.Scanner;
public class DistanceConverter{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter: ");
		//taking input using Scanner
		double km = input.nextDouble();
		//convert kilometers to miles
		double miles = km * (1/1.6);
		
		//Displaying the distance in miles
		System.out.println(miles);
	}
}		