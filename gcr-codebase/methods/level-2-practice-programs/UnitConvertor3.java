/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  
Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertFarhenheitToCelsius(double farhenheit) => 
Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462; 
Method to convert gallons to liters and return the value. Use following code to convert   double gallons2liters = 3.78541; 
Method to convert liters to gallons and return the value. Use following code to convert  double liters2gallons = 0.264172; 
*/

import java.util.Scanner;
public class UnitConvertor3{
	//Method farhenheit to celsius
    public static double convertFarhenheitToCelsius(double farhenheit){
		double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }
	//Method Celsius to farhenheit
    public static double convertCelsiusToFahrenheit(double celsius){
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
		return celsius2farhenheit;
    }
	//Method pounds to kilograms
    public static double convertPoundsToKg(double pounds){
        double pounds2kilograms = 0.453592;
		return pounds * pounds2kilograms;
    }
	//Method kilograms to pounds
    public static double convertKgToPounds(double kg){
        double kilograms2pounds = 2.20462;
		return kg * kilograms2pounds;
    }
	//Method gallons to liters
    public static double convertGallonsToLiters(double gallons){
        double gallons2liters = 3.78541;
		return gallons * gallons2liters;
    }
	//Method liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
		return liters * liters2gallons;
    }
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//farhenheit to celsius
		System.out.print("Enter Fahrenheit: ");
		double farhenheit = sc.nextDouble();
		System.out.println("In celsius: " + convertFarhenheitToCelsius(farhenheit));
		//celsius to farhenheit
		System.out.print("Enter Celsius: ");
		double celsius = sc.nextDouble();
		System.out.println("In farhenheit: " + convertCelsiusToFahrenheit(celsius));
		//pounds to kilograms
		System.out.print("Enter Pounds: ");
		double pounds = sc.nextDouble();
		System.out.println("In kilograms: " + convertPoundsToKg(pounds));
		//kilograms to pounds
		System.out.print("Enter Kilograms: ");
		double kilograms = sc.nextDouble();
		System.out.println("In pounds: " + convertKgToPounds(kilograms));
		//gallons to liters
		System.out.print("Enter Gallons: ");
		double gallons = sc.nextDouble();
		System.out.println("In gallons: " + convertGallonsToLiters(gallons));
		//liters to gallons
		System.out.print("Enter Liters: ");
		double liters = sc.nextDouble();
		System.out.println("In liters: " + convertLitersToGallons(liters));
		sc.close();
	}
}
