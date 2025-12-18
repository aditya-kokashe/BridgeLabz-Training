//Create a program to print the greatest factor of a number beside itself using a loop.

import java.util.Scanner;
class GreatestFactor{
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = input.nextInt();
        int greatestFactor = 1;
        //Loop from number-1 down to 1
        for(int i=number-1; i>=1; i--){
            if(number%i == 0) {
                greatestFactor = i;
                break;
            }
        }


        //Display the Greatest factor
        System.out.println("Greatest factor is: " + greatestFactor);
        input.close();
    }
}
