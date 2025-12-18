//Create a program to print odd and even numbers between 1 to the number entered by the user.

import java.util.Scanner;
class OddEven{
    public static void main(String[] args){
	
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = input.nextInt();
		//Check whether the input number is a natural number
        if(number >= 1) {
			//Loop from 1 to the input number
            for(int i = 1; i <= number; i++){
                if(i % 2 == 0) {
                    System.out.println(i + " is Even");
                }else{
                    System.out.println(i + " is Odd");
                }
            }
        }else{
            System.out.println("Not a natural number");
        }
        input.close();
    }
}
