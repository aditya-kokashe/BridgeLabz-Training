/*
Festival Lucky Draw
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.
*/

import java.util.Scanner;
public class FestivalLuckyDraw{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int visitors = 10; 	//10 visitors
		System.out.println("       Lucky Draw");
		
		//Looping for multiple visitors
		while(true){
			
			//Exit condition if no visitors
			if(visitors==0){
				System.out.println("+------------------------+");
				System.out.println("   Thanks for visiting");
				break;
			}
			
			//Input for number draw
			System.out.print("\n Draw a number: ");
			int drawNum = sc.nextInt();
			
			//Checking if the chosen number is divisible by 3 and 5
			if(drawNum%3==0 && drawNum%5==0){
				System.out.println("+------------------------+");
				System.out.println(" Congrats! you won a gift");
			}else{
				System.out.println(" Better luck next time.");
			}
			visitors--;
		}
	}
}