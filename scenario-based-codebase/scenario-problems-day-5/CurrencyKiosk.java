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
		
		//Using do-while loop for currency conversion
		do{
			//Take INR amount and target currency as input
			System.out.print(" Enter INR amount: ");
			double amount = sc.nextDouble();
			System.out.println(" (Dollar / Yen / Pound)");
			System.out.print(" Enter target currency: ");
			String targetCurrency = sc.next().toLowerCase();
			
			//Using switch for currency rates 
			switch(targetCurrency){
				case "dollar" -> {
					double convertDollar = amount*89.85;	// 1 Dollar = 89.85 INR
					result = convertDollar;
					break;
				}		
				case "yen" -> {
					double convertYen = amount*0.57;		// 1 Yen = 0.57 INR
					result = convertYen;
					break;
				}
				case "pound" -> {
					double convertPound = amount*120.66;	// 1 Pound Sterling = 120.66 INR
					result = convertPound;
					break;
				}
				default -> {
					System.out.println(" Invalid currency");
					break;
				}
			}
			
			//Display the INR amount and conversion amount
			System.out.println(" The "+amount+" INR conversion is: "+ result);
			//Exit condition
			System.out.print("\n Do you want another conversion? (yes/no): ");
			nextConversion = sc.next().toLowerCase();
			
		}while(nextConversion.equals("yes"));
		System.out.println(" Thankyou!");
	}
}