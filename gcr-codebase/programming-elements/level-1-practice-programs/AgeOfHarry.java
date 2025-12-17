//Program 1. Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024

// creating class name AgeOfHarry indicating the purpose is to find Harry's age.
public class AgeOfHarry {
	
	public static void main(String[] args){
		
		//Create an Integer variable yearOfBirth and assign value 2000
		int birthYear = 2000;
		
		// Create an Integer variable currentYear and assign value 2024
		int currentYear = 2024;
		
		// Create an Integer variable ageOfHarry and calculate it by subtracting birthYear from currentYear
		int ageOfHarry = currentYear - birthYear;
		
		//Using print statement we are displaying Harry's current Age
		System.out.println("Harry's age in 2024 is: " + ageOfHarry);
	}
}	