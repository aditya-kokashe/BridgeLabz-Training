/* Write a program to create a basic calculator that performs addition, subtraction, multiplication, 
   and division for two floating-point numbers. */

import java.util.Scanner;
public class BasicCalculator{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int number1 = input.nextInt();
		System.out.print("Enter second number: ");
		int number2 = input.nextInt();
		//Perform calculations operations
		int addition = number1 + number2;
		int subtraction = number1 - number2;
		int multiplication = number1 * number2;
		int division = number1 / number2;

		//Display operations add, subtract, multiplication, division
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
				+ number1 + " and " + number2 + " is "
				+ addition + ", " + subtraction + ", "
				+ multiplication + ", and " + division);
	}
}