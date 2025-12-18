//Create a program to find all the multiples of a number taken as user input below 100.

import java.util.Scanner;
class MultiplesBelow100{
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number: ");
        int number = input.nextInt();
        //Check for positive integer less than 100
        if(number > 0 && number < 100){
		
		
            //Run loop backward from 100 to 1
            for(int i = 100; i >= 1; i--){
                //Check if i is a multiple of number
                if(i%number == 0){
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Enter a positive number less than 100");
        }
    }
}
