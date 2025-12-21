/*An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. 
For this create a program to find the BMI and display the height, weight, BMI and status of each individual*/

import java.util.Scanner;
public class BMICalculator {
    public static void calculateBMI(double[][] data) {
         for(int i=0; i<data.length; i++){
            double weight = data[i][0];
            double heightCm = data[i][1];
            //Convert height from cm to meters
            double heightMeter = heightCm / 100;
            //BMI formula
            double bmi = weight/(heightMeter*heightMeter);
            data[i][2] = bmi;
        }
    }

    public static String[] bmiStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i=0; i<data.length; i++){
            double bmi = data[i][2];
			//Calculate bmi status
            if(bmi <= 18.4){
                status[i] = "Underweight";
            }else if(bmi >= 18.5 && bmi <= 24.9){
                status[i] = "Normal";
            }else if (bmi >= 25.0 && bmi <= 39.9){
                status[i] = "Overweight";
            }else{
                status[i] = "Obese";
            }
        }
        return status;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //2D array - weight, height(cm), BMI
        double[][] persons = new double[10][3];
        for(int i=0; i<10; i++){
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            persons[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            persons[i][1] = sc.nextDouble();
        }
        calculateBMI(persons);
        //BMI status
        String[] bmiStatus = bmiStatus(persons);
        for(int i=0; i<10; i++){
			System.out.println((i + 1) + "\t" + persons[i][0] + "\t" + persons[i][1] + 
				                         "\t" + persons[i][2] + "\t" + bmiStatus[i]);
        }
    }
}
