//Write a program to find the sum of n natural numbers using loop

import java.util.Scanner;
public class SumOfNaturalNumbers{
	public int calculateSum(int number){
		int sum = 0;
		//Check for natural number
		if(number>0){
			//Loop for finding the sum of natural numbers
			for(int i=0; i<=number ; i++){
				sum += i;
			}
		}
		return sum;
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		//Create an object for class SumOfNaturalNumbers 
		SumOfNaturalNumbers sumOfNaturalNumbers = new SumOfNaturalNumbers();
		int result = sumOfNaturalNumbers.calculateSum(number);
		
		
		//Display the sum of Natural numbers
		System.out.println("The sum of "+number+" natural number is: " + result );
	}
}