//Write a program to check whether a number is positive, negative, or zero.

import java.util.Scanner;
public class NumberEvaluation{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		//Taking input from the user.
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		//Checking whether the given number is positive, negative, or zero and displaying the result.
		if(number > 0){
			System.out.println("positive");
		}else if(number < 0){
			System.out.println("negative");
		}else{
			System.out.println("zero");
		}
	}
}