/*program to store the marks of the students in physics, chemistry, and maths in a 2D array and 
then compute the percentage and grade*/

import java.util.Scanner;
class StudentGrades2D{
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int students = input.nextInt();
        int[][] marks = new int[students][3];
        double[] percentage = new double[students];
        String[] grade = new String[students];
		//Implement logic for physics , chemistry ,and maths
        for(int i=0; i<students; i++){
			System.out.print("Enter physics marks: ");
            marks[i][0] = input.nextInt();
			System.out.print("Enter chemistry marks: ");
            marks[i][1] = input.nextInt();
			System.out.print("Enter maths marks: ");
            marks[i][2] = input.nextInt();
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if(percentage[i] >= 75) grade[i] = "A";
            else if(percentage[i] >= 60) grade[i] = "B";
            else if(percentage[i] >= 50) grade[i] = "C";
            else grade[i]= "D";
        }


		//Display the percentage and grade of the student
		for(int i=0; i<students; i++){
            System.out.println("Percentage: "+percentage[i] + " ,Grade: " + grade[i]);
        }
    }
}
