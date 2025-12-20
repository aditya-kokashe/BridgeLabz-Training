//Write a program to check whether a number is positive, negative, or zero.

import java.util.Scanner;
public class PositiveNegativeZero{
	public int checkPositiveNegativeZero(int number){
		//Check number for positive, negative, or zero
		if(number>0){
			return 1;
		}else if(number<0){
			return -1;
		}else{
			return 0;
		}
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		//Create an object for class PositiveNegativeZero 
		PositiveNegativeZero positiveNegativeZero = new PositiveNegativeZero();
		int result = positiveNegativeZero.checkPositiveNegativeZero(number);
		
		
		//Display the number as positive, negative, or zero
		if(result == 1){
			System.out.print("The number is Positive");
		}else if(result == -1){
			System.out.print("The number is Negative");
		}else{
			System.out.print("The number is Zero");
		}
	}
}