/*Write a program to check if the first, second, or third number is the largest of the three.
I/P => number1, number2, number3
O/P => 
Is the first number the largest? ____
Is the second number the largest? ___
Is the third number the largest? ___
*/

import java.util.Scanner;
public class LargestNumberAmong3{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		//Taking 3 numbers as input from the user 
		System.out.println("Enter a number1: ");
		int number1 = sc.nextInt();
		System.out.println("Enter a number2: ");
		int number2 = sc.nextInt();
		System.out.println("Enter a number3: ");
		int number3 = sc.nextInt();
		//taking 3 boolean variable to check if it is largest
		boolean firstIsLargest = false;
		boolean secondIsLargest = false;
		boolean thirdIsLargest = false;
		//
		if(number1 > number2 & number1 > number3){
			firstIsLargest = true;
		}
		if(number2 > number1 & number2 > number3){
			secondIsLargest = true;
		}		
		if(number3 > number1 & number3 > number2){
			thirdIsLargest = true;
		}		
		
		//Displaying the resulted output
		System.out.println("Is the first number the largest? :" +firstIsLargest +"\n"+
						   "Is the second number the largest? :" + secondIsLargest+"\n"+
						   "Is the third number the largest? :" + thirdIsLargest);
	}
}	
