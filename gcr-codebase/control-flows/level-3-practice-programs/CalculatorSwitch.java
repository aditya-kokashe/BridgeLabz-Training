/*Write a program to create a calculator using switch...case.
Hint => 
Create two double variables named first and second and a String variable named op.
Get input values for all variables.
The input for the operator can only be one of the four values: "+", "-", "*" or "/".
Run a for loop from i = 1 to i < number.
Based on the input value of the op, perform specific operations using the switch...case statement and 
print the result.
If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
If op is neither of those 4 values, print Invalid Operator.
*/

import java.util.Scanner;
public class CalculatorSwitch{
	public static void main(String [] args){
			
			
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double first = input.nextDouble();
		System.out.print("Enter second number: ");
		double second = input.nextDouble();
		System.out.print("Enter a Operator ( + , - , * , / ): ");
		String op = input.next();
		
		
		//Performing operations
		switch(op){
			case "+":
				System.out.print("Result: "+ (first + second));
				break;
			case "-":
				System.out.print("Result: "+ (first - second));
				break;
			case "*":
				System.out.print("Result: "+ (first * second));
				break;
			case "/":
				System.out.print("Result: "+ (first / second));
				break;
			default:
				System.out.print("Invalid Operator");
				break;
		}
	}
}