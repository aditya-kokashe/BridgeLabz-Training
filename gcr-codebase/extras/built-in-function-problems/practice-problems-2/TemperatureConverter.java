import java.util.Scanner;
public class TemperatureConverter{

    //Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius){
        return (celsius*9/5) +32;
    }

    //Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit-32) *5/9;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("(1)Celsius to Fahrenheit");
        System.out.println("(2)Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
		
		
		//Display the results
        if(choice==1){
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            double result = celsiusToFahrenheit(celsius);
            System.out.println("Temperature in Fahrenheit: " + result);
        } 
        else if(choice==2){
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double result = fahrenheitToCelsius(fahrenheit);
            System.out.println("Temperature in Celsius: " + result);
        } 
        else{
            System.out.println("Invalid choice.");
        }
    }
}
