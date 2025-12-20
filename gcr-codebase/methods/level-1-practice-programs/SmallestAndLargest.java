//Write a program to find the smallest and the largest of the 3 numbers.

import java.util.Scanner;
public class SmallestAndLargest{
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int smallest = 0;
		int largest = 0;
		//Find smallest number
		if(number1<number2 && number1<number3){
			smallest = number1;
		}else if(number2<number1 && number2<number3){
			smallest = number2;
		}else{
			smallest = number3;
		}
		//Find largest number 
		if(number1>number2 && number1>number3){
			largest = number1;
		}else if(number2>number1 && number2>number3){
			largest = number2;
		}else{
			largest = number3;
		}
		int[] array = new int[2];
		array[0] = smallest;
		array[1] = largest;
		return array;
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int number1 = sc.nextInt();
		System.out.print("Enter number 2: ");
		int number2 = sc.nextInt();
		System.out.print("Enter number 3: ");
		int number3 = sc.nextInt();
		SmallestAndLargest smallestAndLargest = new SmallestAndLargest();
		
		
		//Display the resulted smallest and largest number
		int [] result = smallestAndLargest.findSmallestAndLargest(number1, number2, number3);
		System.out.println("the smallest is: "+ result[0] +" the largest is: "+ result[1]);
	}
}