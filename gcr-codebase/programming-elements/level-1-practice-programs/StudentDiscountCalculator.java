/*The University is charging the student a fee of INR 125000 for the course. The University is 
willing to offer a discount of 10%. Write a program to find the discounted amount and discounted 
price the student will pay for the course.*/

public class StudentDiscountCalculator {
	public static void main (String[] args) {
		
		//create two variables to assign fee and discount percentage values
		int fee = 125000;
		int discountPercent = 10;
		//computing discount and discounted fees
		int discount = fee / discountPercent;
		int discountedFee = fee - discount;
		
		//display the results
		System.out.println ("The discount amount is INR: " + discount + " and final discounted fee is INR: " + discountedFee);
	}
}