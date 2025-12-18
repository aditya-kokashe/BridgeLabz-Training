//Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 

import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		
		
		//Check input year is according to Gregorian calendar
		if(year >= 1582){
			//The leap year divisible by 4 and not 100 unless it is divisible by 400
			if((year%4==0 && year%100!=0) || (year%400==0)){
				System.out.println("The year: " +year+ " is a Leap Year");
			}else{
			System.out.println("The year: " +year+ " is Not a Leap Year");
			}
		}else{
			System.out.println("Enter year according to the Gregorian calendar");
		}
	}
}