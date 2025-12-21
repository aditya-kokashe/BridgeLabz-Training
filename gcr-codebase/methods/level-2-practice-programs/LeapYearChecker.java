//Write a program that takes a year as input and outputs the Year is a Leap Year or not 

import java.util.Scanner;
public class LeapYearChecker{
    public static boolean isLeapYear(int year){
        return (year>=1582) && ((year%4==0 && year%100!=0) || year%400==0);
    }

	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
        int year = input.nextInt();


		//Display leap year or not a leap year
        System.out.println(isLeapYear(year) ? "It's a Leap Year" : "Not a Leap Year");
        input.close();
    }
}
