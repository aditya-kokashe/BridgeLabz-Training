/*Write a program to input the unit price of an item and the quantity to be bought, 
  then calculate the total purchase price*/

import java.util.Scanner;
public class TotalPurchasePrice{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		//Take input unit price
		System.out.print("Enter unit price: ");
		double unitPrice = input.nextDouble();
		//Take input quantity 
		System.out.print("Enter quantity: ");
		int quantity = input.nextInt();
		//Calculate total price
		double totalPrice = unitPrice * quantity;

		//Display the result
		System.out.println("The total purchase price is INR: " + totalPrice +
				" if the quantity: " + quantity +
				" and unit price is INR: " + unitPrice);
	}
}
