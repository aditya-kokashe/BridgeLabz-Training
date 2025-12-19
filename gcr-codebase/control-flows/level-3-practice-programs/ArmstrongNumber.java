//Create a program to check if a number is armstrong or not. 

import java.util.Scanner;
public class ArmstrongNumber{
	public static void main(String[] agrs){
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number= sc.nextInt();
		int sum = 0;
		int originalNumber = number;
		//Check quotient and reminder
		while(originalNumber != 0){
			int digit = originalNumber%10;
			sum += digit*digit*digit;
			originalNumber /= 10;
		}	
		
		
		//Display the results
		if(number == sum){
			System.out.println("The number is an Armstrong Number!!");
		}else{
			System.out.println("The number is Not an Armstrong Number");
		}
	}
}
