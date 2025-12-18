//Write a program to find the sum of numbers until the user enters 0

import java.util.Scanner;
public class SumOfNumbers{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
        double total = 0.0; 
        System.out.print("Enter a number (0 to stop): ");
        double number = input.nextDouble();
		//Create a logic to sum the numbers until 0
        while (number != 0) {
            total = total + number;
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextDouble();
        }
		
		//Display the resulted output
        System.out.println("The total sum is: " + total);
        input.close();
	}
}