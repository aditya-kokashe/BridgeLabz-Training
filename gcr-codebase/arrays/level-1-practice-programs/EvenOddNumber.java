/*Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. 
Further for positive numbers check if the number is even or odd. 
Finally compare the first and last elements of the array and display if they equal, greater or less*/

import java.util.Scanner;
public class EvenOddNumber{
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		//Take input ages of students
		for(int i=0; i<arr.length ;i++){
			System.out.print("Enter five numbers: ");
			arr[i] = sc.nextInt();
			if(arr[i] > 0){
				if(arr[i]%2==0){
					System.out.println("The number is: Positive Even number");
				}else{
					System.out.println("The number is: Positive Odd number");
				}
			}else if(arr[i]<0){
				System.out.println("The number is: Negative number");
			}else{
				System.out.println("The number is: Zero");
			}
		}
		
		//Check if the First element is greater or smaller than the Last element
		int firstElement = arr[0];
		int lastElement = arr[arr.length-1];
		if(firstElement > lastElement){
			System.out.println("First element is greater than last element ");
		}else if(firstElement == lastElement){
			System.out.println("First element is equal to last element");
		}else{
			System.out.println("First element is smaller than last element");
		}
	}
}
