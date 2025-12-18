//Write a program to find the distance in yards and miles for the distance provided by the user in feet

import java.util.Scanner;
public class DistanceInYardsAndMiles{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		//Taking distance input from user
		System.out.println("Enter the Distance in feet: ");
		double distanceInFeets = sc.nextDouble();
		//1 mile = 1760 yards and 1 yard is 3 feet
		double distanceInYards = distanceInFeets/3;
		double distanceInMiles = distanceInFeets/5280;		
		
		//displaying the resulted side of square
		System.out.println("The distance in yards is: " + distanceInYards +  " while the distance in miles is: " + distanceInMiles);
	}
}