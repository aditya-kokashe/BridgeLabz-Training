/*Write a program to check whether a person can vote, depending on whether his/her age is greater 
than or equal to 18.*/

import java.util.Scanner;
public class VotingEligibility{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		//Taking number as an input from the user 
		System.out.print("Enter age of person: ");
		int age = sc.nextInt();
		boolean canVote = false;
		//checking if the person is 18 or older
		if( age>= 18 ){
			canVote = true;
		}

		//Display the result 
		if(canVote){
			System.out.println("The person's age is: "+ age +" and can vote.");
		}
		else{
			System.out.println("The person's age is: "+ age +" and cannot vote.");
		}
		
	}
}	