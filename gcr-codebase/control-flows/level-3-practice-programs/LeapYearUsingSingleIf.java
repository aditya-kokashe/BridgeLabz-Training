//Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 
//And determine Leap Year with single if condition using logical and && and or || operators


import java.util.Scanner;
public class LeapYearUsingSingleIf{
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		
		
		//Single if condition using && and ||
        if( year >= 1582 && ((year%4==0 && year%100!=0) || (year%400==0))){
            System.out.println("The year: " + year + " is a Leap Year");
        }else{
            System.out.println("The year: " + year + " is Not a Leap Year");
        }
	}
}