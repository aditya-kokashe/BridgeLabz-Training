//Write a program to find the side of the square whose parimeter you read from the user 

import java.util.Scanner;
public class SideOfSquare{
	public static void main(String[] args){
		
		//taking perimeter input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Perimeter Of Square: ");
		double parimeterOfSquare = sc.nextDouble();
		//Perimeter of the Square is 4 times the side
		double sideOfSquare = parimeterOfSquare / 4;
		
		//displaying the resulted side of square
		System.out.println("The length of the side is "+sideOfSquare+" whose perimeter is: " + parimeterOfSquare);
	}
}	