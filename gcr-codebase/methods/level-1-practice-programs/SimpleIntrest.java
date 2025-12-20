/*Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
*/

import java.util.Scanner;
public class SimpleIntrest{
	public void calculateSimpleIntrest(double principle, double rate, double time){
		double calculateSi = (principle * rate * time) / 100;
		//Display the simple intrest
		System.out.println("The Simple Interest is: "+ calculateSi +" for Principal: "+ principle +", Rate of Interest: "+rate +" and Time: "+time);
	}


	public static void main(String[] args){
		//Take input for principle, rate of intrest, and time
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Principle: ");
		double principle = input.nextDouble();
		System.out.print("Enter Rate of Intrest: ");
		double rate = input.nextDouble();
		System.out.print("Enter Time: ");
		double time = input.nextDouble();
		
		
		//Create a SimpleIntrest object
		SimpleIntrest simpleintrest = new SimpleIntrest();
		//Calculate the simple intrest
		simpleintrest.calculateSimpleIntrest(principle,rate,time);
	}
}