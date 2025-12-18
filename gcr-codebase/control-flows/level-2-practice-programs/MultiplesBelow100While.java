//Create a program to find all the multiples of a number taken as user input below 100 using While-loop.

import java.util.Scanner;
class MultiplesBelow100While{
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number: ");
        int number = input.nextInt();
        //Check for positive integer less than 100
        if(number > 0 && number < 100){
		
		
            int counter = 100;
            //Run while loop backward from 100 to 1
            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }else{
            System.out.println("Enter a positive number less than 100");
        }
    }
}
