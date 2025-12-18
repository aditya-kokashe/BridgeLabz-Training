/*Write a program to input marks and 3 subjects physics, chemistry and maths. 
Compute the percentage and then calculate the grade as per the following guidelines*/

import java.util.Scanner;
public class StudentGradeCalculator{
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		//Take input marks of Physics, Chemistry, Maths
		System.out.println("Enter marks for Physics, Chemistry, and Maths respectively (out of 100 each): ");
		int physicsMarks = sc.nextInt();
		int chemistryMarks = sc.nextInt();
		int mathsMarks = sc.nextInt();
		//Calculating the percentage
		int totalMarks = physicsMarks + chemistryMarks + mathsMarks;
		double percentage = (totalMarks / 300.0) * 100.0;
        //Create two strings for grade and remarks
        String grade;
        String remarks;
        //Determine grade and remarks
        if(percentage >= 80){
            grade = "A";
            remarks = "(Level 4, above agency-normalized standards)";
        }else if(percentage >= 70){
            grade = "B";
            remarks = "(Level 3, at agency-normalized standards)";
        }else if(percentage >= 60){
            grade = "C";
            remarks = "(Level 2, below, but approaching agency-normalized standards)";
        }else if(percentage >= 50){
            grade = "D";
			remarks = "(Level 1, well below agency-normalized standards)";
        }else if(percentage >= 40){
            grade = "E";
            remarks = "(Level 1-, too below agency-normalized standards)";
        }else{
            grade = "R";
            remarks = "(Remedial standards)";
        }
        
		
        //Display Output
        System.out.println("Percentage: " + percentage + " % "); 
        System.out.println("Grade: "+ grade);
        System.out.println("Remarks: " + remarks);
	}
}