/* Write a program to take height in centimeters and convert it into feet and inches. */

import java.util.Scanner;
public class HeightConverter{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		//Taking height in centimeters from user
		System.out.print("Enter your height in centimeters: ");
		double heightCentimeters = input.nextDouble();
		//Convert centimeters to inches
		double totalInches = heightCentimeters / 2.54;
		//Convert inches to feet
		int feet = (int) (totalInches / 12);
		double inches = totalInches % 12;

		//Display the result
		System.out.println("Your Height in cm is " + heightCentimeters +
				" while in feet is " + feet +
				" and inches is " + inches);
	}
}
