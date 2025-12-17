/*Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each 
student will get if the pens must be divided equally. Also, find the remaining non-distributed pens. */

public class PenPerStudent{
	public static void main(String[] args){
		
		//Create Two variables to assign the total number of Students and Pens
		int totalStudents = 3;
		int totalPens = 14;
		//Create two variables to calculate Pens per Student and Remaining Pens
		int penPerStudent = totalPens/totalStudents;
		int nonDistributedPens = totalPens%totalStudents;

		//Display the results
		System.out.println("The Pen Per Student is: " + penPerStudent + 
		" and the remaining pen not distributed is: " + nonDistributedPens);
	}
}	
		