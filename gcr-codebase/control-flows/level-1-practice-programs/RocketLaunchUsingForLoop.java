//Rewrite program 8 to do the countdown using the for-loop.

import java.util.Scanner;
public class RocketLaunchUsingForLoop{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		//Taking and input number for the countdown.
		System.out.print("Enter a number: ");
		int counter = input.nextInt();
		
		//Displaying the countdown by decrementing the inputted numberusing for-loop.
		for(int i = counter; i>=1 ; i-- ){
			System.out.println(i);
		}
	}
}