/*Write a program that takes the base and height in cm to find the area of a triangle in 
square inches and square centimeters*/

import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base in Cm: ");
		double baseInCm = sc.nextInt();
		System.out.println("Enter height in Cm: ");
		double heightInCm = sc.nextInt();
		// Let's also convert base and height in inches.
		double baseInInches = baseInCm/2.54;
		double heightInInches = heightInCm/2.54;
		// Area of a Triangle is ½ * base * height
		double areaOfTringleInCm2 = (1.0/2.0) * baseInCm * heightInCm;
		double areaOfTringleInInches2 = (1.0/2.0) * baseInInches * heightInInches;
		
		//displaying the result
		System.out.println("The Area of the triangle in sq in is: " + areaOfTringleInInches2  + " and sq cm is: " + areaOfTringleInCm2);
	}
}