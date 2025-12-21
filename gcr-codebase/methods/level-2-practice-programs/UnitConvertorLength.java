
import java.util.Scanner;
public class UnitConvertorLength{
	
	
    //Convert yards to feet
    public static double convertYardsToFeet(double yards){
        double yards2feet = 3;
        return yards * yards2feet;
    }
    //Convert feet to yards
    public static double convertFeetToYards(double feet){
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    //Convert meters to inches
    public static double convertMetersToInches(double meters){
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    //Convert inches to meters
    public static double convertInchesToMeters(double inches){
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    //Convert inches to centimeters
    public static double convertInchesToCm(double inches){
        double inches2cm = 2.54;
        return inches * inches2cm;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value in yards: ");
        double yards = sc.nextDouble();
		//yards to feet
        System.out.println("Feet: " + convertYardsToFeet(yards));
        System.out.print("Enter value in feet: ");
        double feet = sc.nextDouble();
		//feet to yards
        System.out.println("Yards: " + convertFeetToYards(feet));
        System.out.print("Enter value in meters: ");
        double meters = sc.nextDouble();
		//meteres to inches
        System.out.println("Inches: " + convertMetersToInches(meters));
        System.out.print("Enter value in inches: ");
        double inches = sc.nextDouble();
		//inches to meters
        System.out.println("Meters: " + convertInchesToMeters(inches));
		//inches to centimeters
        System.out.println("Centimeters: " + convertInchesToCm(inches));
        sc.close();
    }
}
