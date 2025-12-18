//Write a program to take 2 numbers and print their quotient and reminder

import java.util.Scanner;
public class QuotientAndReminder{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		//Taking 2 numbers
		System.out.println("Enter number1: ");
		int number1 = sc.nextInt();
		System.out.println("Enter number2: ");
		int number2 = sc.nextInt();
		//calculating quotient and remainder
		//division operator (/) for quotient and moduli operator (%) for reminder
		int quotient = number1/number2;
		int reminder = number1%number2;
		
		//displaying the resulted 
		System.out.println("The Quotient is: "+quotient+" and Reminder is: "+reminder+" of two number: "+number1+" and "+ number2 );
	}
}	