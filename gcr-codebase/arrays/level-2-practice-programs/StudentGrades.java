//Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. 

import java.util.Scanner;
class StudentGrades{
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
		System.out.print("Enter number of students: ");
        int students = input.nextInt();
        int[] physics = new int[students];
        int[] chemistry = new int[students];
        int[] maths = new int[students];
        double[] percentage = new double[students];
        String[] grade = new String[students];
        for(int i=0; i<students; i++){
			System.out.print("Marks in physics: ");
            physics[i] = input.nextInt();
			System.out.print("Marks in chemistry: ");
            chemistry[i] = input.nextInt();
			System.out.print("Marks in maths: ");
            maths[i] = input.nextInt();
            percentage[i] = (physics[i] + chemistry[i] + maths[i])/3.0;
            if(percentage[i]>=75) grade[i] = "A";
            else if(percentage[i]>=60) grade[i] = "B";
            else if(percentage[i]>=50) grade[i] = "C";
            else grade[i] = "D";
        }

		
		//Display the grade of student
        for(int i=0; i<students; i++){
            System.out.println("Percentage: "+percentage[i] + " ,Grade: " + grade[i]);
        }
	}
}