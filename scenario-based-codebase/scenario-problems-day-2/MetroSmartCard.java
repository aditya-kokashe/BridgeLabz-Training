import java.util.Scanner;
public class MetroSmartCard{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		//Initial balance
        double balance = 200;   

		//Calculate distance for fare
        while(balance>0){
            System.out.print("Enter distance in km: ");
            int distance = sc.nextInt();
            if(distance<=0){
				break;
			}
            double fare = (distance<=5) ? 10 : (distance <= 10) ? 20 : 30;
			
			//Fare deducted and remaining balance
            if(fare<=balance){
                balance -= fare;
                System.out.println("Fare deducted: "+ fare);
                System.out.println("Remaining balance: "+ balance);
            }else{
                System.out.println("Insufficient balance");
                break;
            }
        }
        System.out.println("Thank you");
    }
}
