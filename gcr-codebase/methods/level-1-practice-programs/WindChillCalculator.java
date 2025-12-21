//Write a program calculate the wind chill temperature given the temperature and wind speed

import java.util.Scanner;
public class WindChillCalculator{
    //Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed){
        double windChill = 35.74 + 0.6215 * temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }
	

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = input.nextDouble();
        System.out.print("Enter wind speed: ");
        double windSpeed = input.nextDouble();


		//Display the wind chill temperature
        double result = calculateWindChill(temperature, windSpeed);
        System.out.println("Wind Chill Temperature is: " + result);
        input.close();
    }
}
