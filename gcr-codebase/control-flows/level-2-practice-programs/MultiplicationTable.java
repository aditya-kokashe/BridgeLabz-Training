//Create a program to find the multiplication table of a number entered by the user from 6 to 9.

import java.util.Scanner;
class MultiplicationTable{
    public static void main(String[] args){
	
	
		//Take input number
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = input.nextInt();


		//Loop from 6 to 9 to generate the multiplication table
        for (int i=6; i<=9; i++) {
            System.out.println(number+ " * " + i + " = " +(number * i));
        }
    }
}