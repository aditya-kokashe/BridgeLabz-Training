/*Write a program FizzBuzz, take a number as user input, and check for a positive integer. 
If positive integer, loop and print the number, but for multiples of 3 print "Fizz" instead
of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz" using while loop*/

import java.util.Scanner;
class FizzBuzzWhile{
    public static void main(String[] args){

        //Take input number to check for positive integer
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = input.nextInt();
        
		int i = 1;
        if(number > 0){
			//Using While loop to display the output
            while (i<=number){
                if (i % 3 == 0 && i % 5 == 0){
                    System.out.println("FizzBuzz");
                }
				else if (i % 3 == 0){
                    System.out.println("Fizz");
                }
				else if (i % 5 == 0){
                    System.out.println("Buzz");
                }
				else{
                    System.out.println(i);
                }
				i++;
            }
        }else{
            System.out.println("Input number is Not a positive number");
        }
        input.close();
    }
}
