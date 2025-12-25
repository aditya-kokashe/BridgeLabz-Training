import java.util.Scanner;
public class CoffeeCounterChronicles{

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //GST percentage 5% GST
        double GST = 0.05;   
		
        while(true){
			System.out.println("(Espresso/Americano/Cappuccino)");
            System.out.print("Enter coffee type or (exit) to stop: ");
            String coffeeType = sc.next().toLowerCase();
            //Exit condition
            if(coffeeType.equals("exit")){
                System.out.println("Thank you for visiting!");
                break;
            }
			
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            double priceCoffee =0;
            //Choose coffee price using switch
            switch(coffeeType){
                case "espresso":
                    priceCoffee =120;
                    break;
                case "latte":
                    priceCoffee =150;
                    break;
                case "cappuccino":
                    priceCoffee =180;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }
			
            //Calculate total
            double totalAmount = priceCoffee*quantity;
            double gstAmount = totalAmount*GST;
            double finalBill = totalAmount+gstAmount;

            //Display bill
            System.out.println("CoffeeAmount: " + totalAmount);
            System.out.println("GST(5%): " + gstAmount);
            System.out.println("Final Bill: " + finalBill);
        }
	}
}