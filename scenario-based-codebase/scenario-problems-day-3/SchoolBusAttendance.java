/*9. School Bus Attendance System 
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.*/

import java.util.Scanner;
public class SchoolBusAttendance{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//10 Students
		String[] students = new String[10];
		System.out.println("+----------------------------+");
		System.out.println(" School bus Attendance System");
		System.out.println("+----------------------------+");
		int present = 0;
		int absent = 0;
		
		int index = 0;
		//Looping for student name and student status
		for(String s : students){
			
			//Student day input
			System.out.print(" Enter "+(index+1)+" student name: ");
			students[index] = sc.next();
			System.out.println();
			
			//Student present or absent 
			System.out.println(" Student name: "+ students[index]);
			System.out.println(" For Present : (P) \n For Absent : (A)");
			System.out.print(" Student status: ");
			//Make the input lowercase
			char ch = sc.next().toLowerCase().charAt(0);
			
			//Calculate present and absent students
			System.out.println();
			if(ch == 'p'){
				present++;
			}
			else {
				absent++;
			}
			index++;
		}
		
		//Display present and absent student number
		System.out.println();
		System.out.println("+----------------------------+");
		System.out.println(" Total students present: "+present);
		System.out.println(" Total students absent: "+absent);
		System.out.println("+----------------------------+");
	}
}