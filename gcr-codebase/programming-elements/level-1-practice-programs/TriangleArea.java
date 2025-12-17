/* Write a program to take base and height of a triangle and calculate its area in square centimeters and square inches. */

import java.util.Scanner;
public class TriangleArea{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		//Take input base and height
		System.out.print("Enter base of triangle: ");
		double base = input.nextDouble();
		System.out.print("Enter height of triangle: ");
		double height = input.nextDouble();
		//Calculate area in square centimeters
		double areaSquareCentimeter = 0.5 * base * height;
		//Convert square centimeters to square inches
		double areaSquareInches = areaSquareCentimeter / 6.45;

		// Display the result
		System.out.println("Area of triangle in square centimeters is " 
				+ areaSquareCentimeter + " and in square inches is " + areaSquareInches);
	}
}
