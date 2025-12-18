//Create a program to find the factors of a number taken as user input Using While loop.

import java.util.Scanner;
class FactorsUsingWhile{
    public static void main(String[] args){


        //Take input from the user
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = input.nextInt();


        if(number > 0){
            int counter = 1;
            //While loop till counter is less than number
            while(counter < number){
                if(number%counter == 0){
                    System.out.println(counter);
                }
                counter++;
            }
        }else{
            System.out.println("Input number is not a positive number");
        }
    }
}
