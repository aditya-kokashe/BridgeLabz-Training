/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  
Please define static methods for all the UnitConvertor class methods.*/

import java.util.Scanner;
public class UnitConvertor{
    //Convert Kilometers to Miles
    public static double convertKmToMiles(double km){
        double km2miles = 0.621371;
        double miles = km * km2miles;
        return miles;
    }
    //Convert Miles to Kilometers
    public static double convertMilesToKm(double miles){
        double miles2km = 1.60934;
        double km = miles * miles2km;
        return km;
    }
    //Convert Meters to Feet
    public static double convertMetersToFeet(double meters){
        double meters2feet = 3.28084;
        double feet = meters * meters2feet;
        return feet;
    }
    //Convert Feet to Meters
    public static double convertFeetToMeters(double feet){
        double feet2meters = 0.3048;
        double meters = feet * feet2meters;
        return meters;
    }


    public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		//Take input from the user
		System.out.print("Enter Kilometers: ");
        double km = sc.nextDouble();
		System.out.print("Enter Meters: ");
        double meters = sc.nextDouble();
		System.out.print("Enter Miles: ");
        double miles = sc.nextDouble();
		System.out.print("Enter Feets: ");
        double feets = sc.nextDouble();
		
		
		//Display results
        double newMiles = convertKmToMiles(km);
        System.out.println(km + " Kilometer = " + newMiles + " Miles");
        double newFeet = convertMetersToFeet(meters);
        System.out.println(meters+" Meter = " + newFeet + " Feet");
		double newKilometer = convertMilesToKm(miles);
        System.out.println(miles+" Miles = " + newKilometer + " Kilometers");
		double newMeter = convertFeetToMeters(feets);
        System.out.println(feets+" Feets = " + newMeter + " Meters");
    }
}
