/*
Currency Exchange Kiosk
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).
*/

import java.util.Scanner;
public class CurrencyKiosk{
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		
		double result = 0;
		String nextConversion = "";
		System.out.println("\n    Currency Exchange Kiosk");
		System.out.println(" +----------------------------+");
		
		//Using do-while loop for currency conversion
		do{
			//Take INR amount and target currency as input
			System.out.print("\n Enter INR amount: ");
			double amount = sc.nextDouble();
			System.out.println(" (Dollar / Yen / Pound)");
			System.out.print(" Enter target currency: ");
			String targetCurrency = sc.next().toLowerCase();
			String currency = "";
			
			//Using switch for currency rates 
			switch(targetCurrency){
				case "dollar" -> {
					double convertDollar = amount*0.011;	// 1 INR = 0.011 Dollar
					result = convertDollar;
					currency = "Dollar";
					break;
				}		
				case "yen" -> {
					double convertYen = amount*1.74;		// 1 INR = 1.74 Yen
					result = convertYen;
					currency = "Yen";
					break;
				}
				case "pound" -> {
					double convertPound = amount*0.0083;	// 1 INR = 0.0083 Pound Sterling
					result = convertPound;
					currency = "Pound";
					break;
				}
				default -> {
					System.out.println(" Invalid currency.");
					result = amount;
					break;
				}
			}
			
			//Display the INR amount and conversion amount
			System.out.println(" +----------------------------+");
			System.out.println(" "+amount+" INR in "+currency+" is: "+ result+"/-");
			//Exit condition
			System.out.print("\n Do you want another conversion? (yes/no): ");
			nextConversion = sc.next().toLowerCase();
			
		}while(nextConversion.equals("yes"));
		System.out.println(" Thankyou!");
	}
}