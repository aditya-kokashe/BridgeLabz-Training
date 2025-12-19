//Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons

import java.util.Scanner;
class BMIUsing2DArray{
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
		System.out.print("Enter number of persons: ");
        int persons = input.nextInt();
        double[][] personData = new double[persons][3];
        String[] status = new String[persons];
        for(int i=0; i<persons; i++){
			System.out.print("Enter weight: ");
            personData[i][0] = input.nextDouble(); 
			System.out.print("Enter height: ");
            personData[i][1] = input.nextDouble();
            personData[i][2] = personData[i][0] / ((personData[i][1]/100)*(personData[i][1]/100));
            if(personData[i][2]<18.5) status[i] = "Underweight";
            else if(personData[i][2]<25) status[i] = "Normal";
            else if(personData[i][2]<30) status[i] = "Overweight";
            else status[i] = "Obese";
        }


		//Display the results
        for(int i=0; i<persons; i++){
			System.out.println("Height: " + personData[i][1] + " cm  Weight: " + personData[i][0] + " kg");
			System.out.println("BMI: " + personData[i][2] + "  Status: " + status[i]);
		}

	}
}