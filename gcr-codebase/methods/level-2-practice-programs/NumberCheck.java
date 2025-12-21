/*Write a program to take user input for 5 numbers and check whether a number is positive or negative. 
Further for positive numbers check if the number is even or odd. Finally compare the first and last elements 
of the array and display if they are equal, greater, or less*/

import java.util.Scanner;
public class NumberCheck{
    //Check if number is positive
    public static boolean isPositive(int number){
		if(number>0){
			return true;
		}else{
			return false;
		}
    }
    //Check if number is even
    public static boolean isEven(int number){
		if(number%2==0){
			return true;
		}else{
			return false;
		}
    }
    //Compare two numbers
    public static int compare(int number1, int number2){
        if(number1>number2){
            return 1;
		}
        else if(number1 == number2){
            return 0;
		}
        else{
            return -1;
		}
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        //Take input and check each number
        for(int i=0; i<numbers.length; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            if(isPositive(numbers[i])){
                if(isEven(numbers[i])){
                    System.out.println("Positive Even");
                }else{
                    System.out.println("Positive Odd");
                }
            }else if(numbers[i]<0){
                System.out.println("Negative");
            }else{
                System.out.println("Zero");
            }
        }
        //Compare first and last elements
        int result = compare(numbers[0], numbers[4]);


		//Display the result
        if(result==0){
            System.out.println("First and Last elements are Equal");
        }else if(result==1){
            System.out.println("First element is Greater than Last element");
        }else{
            System.out.println("First element is Less than Last element");
        }
        input.close();
    }
}

