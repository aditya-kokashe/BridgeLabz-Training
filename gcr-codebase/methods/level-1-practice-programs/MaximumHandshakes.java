//Create a program to find the maximum number of handshakes among students.

import java.util.Scanner;
public class MaximumHandshakes{
	public int calculateMaxHandshakes(int n){
		//Calculate the Handshakes using formula
		int calculateHandshakes = (n * (n - 1)) / 2;
		return calculateHandshakes;
	}
		
		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Take input number of students
		System.out.print("Enter number of students: ");
		int numberOfStudents = sc.nextInt();
		//Create object of the class MaximumHandshakes
		MaximumHandshakes maxHandshakes = new MaximumHandshakes();
		int result = maxHandshakes.calculateMaxHandshakes(numberOfStudents);
		
		
		//Display the max handshakes of students
		System.out.println("The Maximum handshakes are: "+ result +" of "+ numberOfStudents +" students");
	}
}