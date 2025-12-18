//Write a Program to find the factorial of an integer entered by the user using For loop.

import java.util.Scanner;
class FactorialForLoop{
    public static void main(String[] args){
        
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = input.nextInt(); 
        if (number >= 0){
            int factorial = 1;
			//The logic of calculating factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

			
			//Display the factorial using for loop
            System.out.println("Factorial is: " + factorial);
        }else{
            System.out.println("Not a natural number");
        }
        input.close();
    }
}