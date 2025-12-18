//Create a program to find the power of a number.

import java.util.Scanner;
class PowerOfNumber{
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
		System.out.println("Enter number and power: ");
        int number = input.nextInt();
        int power = input.nextInt();
        //Check for positive integers
        if(number > 0 && power > 0){
            int result = 1;
            //Run loop from 1 to power
            for(int i=1; i<=power; i++){
                result=result*number;
            }


            //Display the result
            System.out.println("Result is: " + result);
        }else{
            System.out.println("Enter positive integers only");
        }
    }
}
