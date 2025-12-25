import java.util.Scanner;
public class MayaFitnessTracker{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Input height and weight
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();
        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();
        //BMI formula
        double bmi = weight / (height*height);
        //Display BMI value
        System.out.println("Your BMI is: "+ bmi);
		
		
        //BMI category
        if(bmi<18.5){
            System.out.println("Underweight");
        } 
        else if(bmi>=18.5 && bmi<25){
            System.out.println("Normal");
        } 
        else{
            System.out.println("Overweight");
        }
    }
}
