//Create a program to find the factors of a number taken as user input.

import java.util.Scanner;
class FactorsOfNumber{
    public static void main(String[] args){

		//Take user input number
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = input.nextInt();

		//Check number is positive number
        if(number > 0){
            for (int i = 1; i < number; i++){
                if (number % i == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
