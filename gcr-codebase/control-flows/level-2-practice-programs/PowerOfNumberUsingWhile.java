//Rewrite the above program to find the power of a number using a while loop.

import java.util.Scanner;
class PowerOfNumberUsingWhile{
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
		System.out.println("Enter number and power: ");
        int number = input.nextInt();
        int power = input.nextInt();
		//Create result and counter variable
        int result = 1;
        int counter = 0;
        //Run while loop till counter equals power
        while(counter < power){
            result=result * number;
            counter++;
        }


        //Display the result
        System.out.println("Result is: " + result);
    }
}