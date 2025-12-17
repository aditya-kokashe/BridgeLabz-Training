//Create a program to find the maximum number of handshakes among N number of students.

import java.util.Scanner;
public class MaxHandshakes{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		//Take input number of students 
		System.out.print("Enter number of students: ");
		int numberOfStudents = input.nextInt();
		//Calculate maximum handshakes using formula
		int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

		//Display maximum number of possible handshakes
		System.out.println("The maximum number of possible handshakes is " + handshakes);
	}
}
