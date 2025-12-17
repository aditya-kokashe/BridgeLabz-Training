//Create a program to convert the distance of 10.8 kilometers to miles.

//Create a class KilometersToMiles to convert the distance of 10.8 kilometers to miles
public class KilometersToMiles{
	public static void main(String[] args){
		
		//Creating a double variable and assigning the value of distance in Kilometers
		double distanceInKms = 10.8;
		
		//Create a double variable to convert Kilometer distance into Miles
		double distanceInMiles = distanceInKms * 1.6;	
		
		//Display distance of 10.8 kilometers to miles
		System.out.println("The distance " + distanceInKms + "km in miles is: " + distanceInMiles);
	}
}	
		