//Write a program to check if a number is divisible by 5

import java.util.Scanner;
public class DivisibleBy5{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		//Taking a number as an input 
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		boolean isDivisible = false;
		//checking whether if the input number is divisible by 5
		if(number % 5 ==0){
			isDivisible = true;
		}
		
		//Displaying the resulted output
		System.out.println("Is the number: "+ number + " divisible by 5? " + isDivisible);
	}
}	