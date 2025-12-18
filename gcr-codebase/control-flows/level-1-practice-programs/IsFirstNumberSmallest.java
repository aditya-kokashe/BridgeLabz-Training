//Write a program to check if the first is the smallest of the 3 numbers.

import java.util.Scanner;
public class IsFirstNumberSmallest{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		//Taking 3 numbers as input from the user 
		System.out.println("Enter a number1: ");
		int number1 = sc.nextInt();
		System.out.println("Enter a number2: ");
		int number2 = sc.nextInt();
		System.out.println("Enter a number3: ");
		int number3 = sc.nextInt();
		//taking boolean variable to check if first is the smallest
		boolean isSmallest = false;
		
		if(number1 < number2 & number1 < number3){
			isSmallest = true;
		}
		
		//Displaying the resulted output
		System.out.println("Is the first number the smallest? " + isSmallest);
	}
}	
