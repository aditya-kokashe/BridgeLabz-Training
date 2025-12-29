import java.util.Scanner;
public class ParkingLot{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int capacity = 10;
		
		//Looping till user input exit or the parking lot is full
		while(true){
			System.out.println("(Park / Exit / Show Occupancy)");
			System.out.println("Enter Task: ");
			String task = sc.nextLine().toLowerCase();		
			
			//Exit logic 
			if(task.equals("exit")){
				System.out.println("Thankyou for visiting!");
				break;
			}
			//exit logic if the parking lot is full
			if((capacity-count)<= 0){
				System.out.println("Parking lot is full.");
				break;
			}
			
			//Switch using to choose between Park, Exit, Show Occupancy
			switch(task){
				case "park" :
					count++;
					System.out.println("You can park you vehicle.");
					break;
				case "show occupancy" :
					System.out.println((capacity - count) + " : is the remaining capacity");
					break;
				default : 
					continue;
			}	
		}
	}
}