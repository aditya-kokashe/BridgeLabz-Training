//Write a program to find the side of a square by taking the perimeter as user input.

import java.util.Scanner;
public class SquareSide{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		//Take perimeter
		System.out.print("Enter the perimeter of the square: ");
		int perimeter = input.nextInt();
		//Calculate side of the square
		int side = perimeter / 4;

		//Display the side of a square
		System.out.println("The length of the side is: " + side + " whose perimeter is: " + perimeter);
	}
}
