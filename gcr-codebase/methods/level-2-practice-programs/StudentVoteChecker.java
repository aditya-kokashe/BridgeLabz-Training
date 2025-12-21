/*Write a program to take user input for the age of all 10 students in a class and check whether the student 
can vote depending on his/her age is greater or equal to 18.
*/

import java.util.Scanner;
public class StudentVoteChecker{
    public boolean canStudentVote(int age){
		//Check student age is valid and equal to and above 18
        if(age<0) {
			return false;
		}else{
			if(age>=18){
				return true;
			}else{
				return false;
			}
		}
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();
		//Student array for ages
        int[] ages = new int[10];
        for (int i=0; i<ages.length; i++) {
			System.out.print("Enter students age: ");
            ages[i] = input.nextInt();
			
			
			//Display student can vote or cannot vote
            System.out.println(checker.canStudentVote(ages[i]) ? "Can Vote" : "Cannot Vote");
        }
        input.close();
    }
}
