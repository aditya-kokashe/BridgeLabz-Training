//Write a program to calculate various trigonometric functions using Math class given an angle in degrees

import java.util.Scanner;
public class TrigonometricCalculator{
    //Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle){
        double radians = Math.toRadians(angle);
        double[] result = new double[3];
		//sine
        result[0] = Math.sin(radians); 
		//cosine
        result[1] = Math.cos(radians); 
		//tangent
        result[2] = Math.tan(radians); 
        return result;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();
        double[] values = calculateTrigonometricFunctions(angle);


		//Display various trigonometric functions
        System.out.println("Sine value: " + values[0]);
        System.out.println("Cosine value: " + values[1]);
        System.out.println("Tangent value: " + values[2]);
        input.close();
    }
}
