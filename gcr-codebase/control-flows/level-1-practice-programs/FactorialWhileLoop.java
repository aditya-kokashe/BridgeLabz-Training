//Write a Program to find the factorial of an integer entered by the user.

import java.util.Scanner;
class FactorialWhileLoop {
    public static void main(String[] args){
        
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = input.nextInt();
		//Check the input number 
        if (number >= 0){
            int factorial = 1;
            int i = 1;
            while (i <= number){
                factorial *= i;
                i++;
            }
			
			//Display the factorial
            System.out.println("Factorial is: " + factorial);
        }else{
            System.out.println("Not a natural number");
        }
        input.close();
    }
}
