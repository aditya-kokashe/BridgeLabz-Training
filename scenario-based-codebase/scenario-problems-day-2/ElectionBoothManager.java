import java.util.Scanner;
public class ElectionBoothManager{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int candidate1 = 0;
		int candidate2 = 0; 
		int candidate3 = 0;
		
        while(true){
			//Break if age is less than 0
            System.out.print("Enter voter age: ");
            int age = sc.nextInt();
            if(age<0){
				break;
			}	
			
			//If above 18 vote for candidate 1, 2 and 3  
            if(age>=18){
                System.out.print("Vote for Candidate(1/2/3): ");
                int vote = sc.nextInt();
                if(vote ==1){
					candidate1++;
				}	
                else if(vote ==2){
					candidate2++;
				}	
                else if(vote ==3){
					candidate3++;
				}	
                else{
					System.out.println("Invalid vote");
				}	
            }else{
                System.out.println("Not eligible to vote");
            }
        }

		//Display the results of votes for candidate 1, 2 and 3
        System.out.println("Candidate 1: "+ candidate1);
        System.out.println("Candidate 2: "+ candidate2);
        System.out.println("Candidate 3: "+ candidate3);
    }
}
