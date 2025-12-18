//Create a program to print odd and even numbers between 1 to the number entered by the user.

import java.util.Scanner;
class OddEven{
    public static void main(String[] args){


        //taking an input as a number
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number >= 1){
			//Check the input number is a natural number
            for (int i = 1; i <= number; i++){
				
				
				//Check if the current number is even and odd
                if (i % 2 == 0)
                    System.out.println(i + " is Even");
                else
                    System.out.println(i + " is Odd");
            }
        }else{
            System.out.println("Not a natural number");
        }
        input.close();
    }
}
