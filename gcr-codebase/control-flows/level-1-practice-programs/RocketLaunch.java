/*Write a program to count down the number from the user input value to 1 using a while loop 
for a rocket launch*/

import java.util.Scanner;
public class RocketLaunch{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		//Taking and input number for the countdown.
		System.out.print("Enter a number: ");
		int counter = input.nextInt();
		
		//Displaying the countdown by decrementing the inputted number.
		while(counter >= 1){
			System.out.println(counter);
			counter--;
		}
	}
}