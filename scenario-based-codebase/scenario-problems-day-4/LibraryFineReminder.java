/*
15. Rohan’s Library Reminder App 
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.
*/

//Import LocalDate and temporal.ChronoUnit
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import java.util.Scanner;
public class LibraryFineReminder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int totalBooks = 5;		//Total books
		int finePerDay = 5; 	//₹5 per day
		
		for(int i=0; i<totalBooks; i++){
			System.out.println("               Book " + (i+1));
			System.out.println("+------------------------------------+");
			
			//Take date input for due and return date
			System.out.println(" Date format -> (yyyy-mm-dd)");
			System.out.print(" Due date : \t");
			
			//use LocalDate to take date input
			LocalDate dueDate = LocalDate.parse(sc.next()); 	
			System.out.print(" Return date : \t");
			LocalDate returnDate = LocalDate.parse(sc.next());
			System.out.println();
			
			if(returnDate.isAfter(dueDate)){
				
				//Use ChronoUnit to calculate days in between
				long lateDays = ChronoUnit.DAYS.between(dueDate, returnDate); 	
				long fine = lateDays * finePerDay;
				System.out.println(" Late by "+lateDays+ " days");
				System.out.println(" Fine : "+ fine +" rupees");
				System.out.println();
			}
			else{
				System.out.println(" Returned on time, No fine");
				System.out.println();
			}
		}
		System.out.println(" Thankyou!");
	}
}