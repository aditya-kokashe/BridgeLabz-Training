/* Write a program to calculate the discount amount and final fee
   by taking Student Fee and University Discount percentage from user */

import java.util.Scanner;
public class StudentFeeDiscount{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the student fee: ");
		double fee = input.nextDouble();
		//Create variable to store discount percentage
		System.out.print("Enter discount percentage: ");
		double discountPercent = input.nextDouble();
		//Calculate discount amount
		double discount = (fee * discountPercent) / 100;
		//Calculate final fee after discount
		double finalFee = fee - discount;

		//Display the result
		System.out.println("The discount amount is INR " + discount +
				" and final discounted fee is INR " + finalFee);
	}
}
