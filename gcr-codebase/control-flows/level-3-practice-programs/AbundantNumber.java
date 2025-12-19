//Create a program to check if a number is an Abundant Number.


import java.util.Scanner;
public class AbundantNumber{
	public static void main(String[] agrs){
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		//Take input form the user for checking Abundant number
		int number= sc.nextInt();
		int sum = 0;
		//Create logic for Abundant number checking
		for(int i=1; i<number ;i++){
			if(number%i==0){
				sum += i;
			}
		}
		
		
		//Display the results
		if(sum>number){
			System.out.println("Abundant Number");
		}else{
			System.out.println("Not an Abundant Number");
		}
	}
}