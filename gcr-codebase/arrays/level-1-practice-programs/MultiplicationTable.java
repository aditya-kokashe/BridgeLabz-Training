/*Create a program to print a multiplication table of a number.*/

import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		int[] multiplicationTable = new int[10];
		//Looping through the array to store multiplication values
		for(int i=0; i<multiplicationTable.length; i++){
			multiplicationTable[i]= number*(i+1);
		}
		
		
		//Display the resulted multiplication table
		for(int i=0; i<multiplicationTable.length; i++){
			System.out.println(number + "*" + (i+1) + "=" + multiplicationTable[i]);
		}
	}
}