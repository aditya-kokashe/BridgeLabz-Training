/*Write a program to input the unit price of an item and the quantity to be bought.
 Then, calculate the total price*/

import java.util.Scanner;
public class TotalPriceCalculation{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		//Taking input of Unit price of an Item
		System.out.println("Enter unitPrice of Item: ");
		int unitPrice = sc.nextInt();
		//Taking input of qantity to be bought
		System.out.println("Enter Quantity to be bought: ");
		int quantityToBought = sc.nextInt();
		//calculating total price
		int totalPrice = unitPrice * quantityToBought;
		
		//displaying the resulted 
		System.out.println("The total purchase price is INR: "+ totalPrice +" if the quantity: " + quantityToBought + " and unit price is INR: " + unitPrice );
	}
}	