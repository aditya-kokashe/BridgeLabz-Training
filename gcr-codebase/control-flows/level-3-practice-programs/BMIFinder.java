/*Create a program to find the BMI of a person
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and
store it in the corresponding variable.
Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Use the table to determine the weight status of the person
*/

import java.util.Scanner;
public class BMIFinder{
	public static void main(String [] args){
			
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter weight(in Kg): ");
		double weight = input.nextDouble();
		System.out.print("Enter Height(in Cm): ");
		double heightInCm = input.nextDouble();
		//convert cm to meter
		double heightInMeter = heightInCm * 0.01;
		double bmi = weight / (heightInMeter * heightInMeter);
		
		
		//Display the result of BMI
		if(bmi >= 40.0){
			System.out.print("Obese");
		}
		else if(bmi >= 25.0 && bmi <=39.9){
			System.out.print("Overweight");
		}
		else if(bmi >= 18.5 && bmi <=24.9){
			System.out.print("Normal");
		}
		else if(bmi <= 18.4){
			System.out.print("Underweight");
		}
		
	}
}