/* Write a program to create a basic calculator that performs addition, subtraction, multiplication, 
   and division for two floating-point numbers. */

import java.util.Scanner;
public class BasicCalculator{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double number1 = input.nextDouble();
		System.out.print("Enter second number: ");
		double number2 = input.nextDouble();
		//Perform calculations operations
		double addition = number1 + number2;
		double subtraction = number1 - number2;
		double multiplication = number1 * number2;
		double division = number1 / number2;

		//Display operations add, subtract, multiplication, division
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
				+ number1 + " and " + number2 + " is "
				+ addition + ", " + subtraction + ", "
				+ multiplication + ", and " + division);
	}
}
