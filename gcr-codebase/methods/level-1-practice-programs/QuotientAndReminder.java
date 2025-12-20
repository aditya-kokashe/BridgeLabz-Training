//Write a program to take 2 numbers and print their quotient and reminder*/

import java.util.Scanner;
public class QuotientAndReminder{
	public static int[] findRemainderAndQuotient(int number, int divisor){
		//Check quotient and reminder
		int quotient = number / divisor;
		int reminder = number % divisor;
		int[] array = new int[2];
		//Assign quotient and reminder to array
		array[0] = quotient;
		array[1] = reminder;
		return array;
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		System.out.println("Enter a divisor: ");
		int divisor = sc.nextInt();
		QuotientAndReminder quotientAndReminder = new QuotientAndReminder();
		int[] result = quotientAndReminder.findRemainderAndQuotient(number , divisor);
		
		
		//Display the quotient and reminder
		System.out.println("The Quotient is: "+ result[0] + " and the Reminder is: " + result[1]);
	}
}