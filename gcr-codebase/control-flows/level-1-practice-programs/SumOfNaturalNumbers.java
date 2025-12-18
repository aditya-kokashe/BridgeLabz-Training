//Write a program to check for the natural number and write the sum of n natural numbers 

import java.util.Scanner;
public class SumOfNaturalNumbers{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		//Taking number as an input from the user 
		System.out.print("Enter a Natural number: ");
		int number = sc.nextInt();
		boolean isNatural = false;
		//checking is the input number is Natural number
		if(number >= 0){
			isNatural = true;
		}		
		//sum of n natural numbers is: n * (n+1) / 2	
		int sumOfNaturalNumbers = number * (number+1) / 2;
		
		if(isNatural){
			System.out.println("The sum of: "+ number +" natural numbers is: " + sumOfNaturalNumbers);
		}else{
			System.out.println("The number: "+ number +" is not a natural number");
		}
	}
}	
