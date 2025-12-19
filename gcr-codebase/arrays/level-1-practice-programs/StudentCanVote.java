/*Write a program to take user input for the age of all 10 students in a class and check whether the student
can vote depending on his/her age is greater or equal to 18.
*/

import java.util.Scanner;
public class StudentCanVote{
	public static void main(String[]args){
		
		Scanner input= new Scanner(System.in);
		int [] arr = new int[10];
		//Take input ages of students
		for(int i=0; i<arr.length ;i++){
			System.out.print("Enter age of the students: ");
			arr[i] = input.nextInt();
			
			
			//Display student can vote or not based on their ages
			if(arr[i] < 0){
				System.out.println("invalid age");
			}else if(arr[i] >= 18){
				System.out.println("The student with the age "+arr[i]+" can vote");
			}else{
				System.out.println("The student with the age "+arr[i]+" cannot vote");
			}
		}
	}
}