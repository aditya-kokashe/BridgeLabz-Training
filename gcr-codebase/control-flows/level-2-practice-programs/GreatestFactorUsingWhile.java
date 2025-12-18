/*Rewrite the Factors using for loop program to print the greatest factor 
of a number beside itself using a while loop.*/

import java.util.Scanner;
class GreatestFactorUsingWhile{
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = input.nextInt();
        int greatestFactor = 1;
        int counter = number - 1;
		//Loop from number-1 down to 1
        while(counter >= 1){
            if(number % counter == 0){
                greatestFactor = counter;
                break;
            }
            counter--;
        }


        //Display the Greatest factor
        System.out.println("Greatest factor is: " + greatestFactor);
        input.close();
    }
}
