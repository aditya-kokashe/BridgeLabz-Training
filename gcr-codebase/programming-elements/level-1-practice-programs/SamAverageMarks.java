//Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM

//create a class SamAverageMarks to show that it calculate Sam's average marks in Math, Physics, and Chemistry
public class SamAverageMarks{
	public static void main(String[] args){
		
		//creating three integer variables to assign Maths, Physics, and Chemistry Marks
		int mathMarks = 94;
		int physicsMarks = 95;
		int chemistryMarks = 96;
		
		//create an integer variable to calculate the average marks of Sam
		int averageMarks = (mathMarks + physicsMarks + chemistryMarks)/3;
		
		//display Sam's average marks
		System.out.println("Sam’s average mark in PCM is: " + averageMarks);
	}
}	
		