/*An athlete runs in a triangular park with sides provided as input by the user in meters. 
If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
*/

import java.util.Scanner;
public class AthleteRuns{
	public double calculatePerimeter(double firstSide, double secondSide, double thirdSide, double distanceInMeters){
		//Calculating the perimeter
		double perimeter = firstSide + secondSide + thirdSide;
		//Calculating the number of rounds
		double rounds = distanceInMeters/perimeter;
		return rounds;
	}
	
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first side of triangle: ");
		double firstSide = input.nextDouble();
		System.out.print("Enter second side of triangle: ");
		double secondSide = input.nextDouble();
		System.out.print("Enter third side of triangle: ");
		double thirdSide = input.nextDouble();
		double distanceInKm = 5;
		double distanceInMeters = distanceInKm * 1000;
		
		
		//Create an object for AthleteRuns
		AthleteRuns atheleteRuns = new AthleteRuns();
		double rounds = atheleteRuns.calculatePerimeter(firstSide,secondSide,thirdSide, distanceInMeters);
		//Display number of rounds
		System.out.print("The Athlete will complete 5 Km distance in: "+ rounds +" rounds.");
		input.close();
	}
}