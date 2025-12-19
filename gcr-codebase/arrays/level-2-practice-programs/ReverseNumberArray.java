/*Create a program to take a number as input and reverse the number. 
To do this, store the digits of the number in an array and display the array in reverse order*/

import java.util.Scanner;
class ReverseNumberArray{
    public static void main(String[] args){


        Scanner input =new Scanner(System.in);
		System.out.println("Enter a number: ");
        int number =input.nextInt();
        int temp =number;
        int count=0;
        while(temp!=0){
            count++;
            temp/=10;
        }
        int[] digits = new int[count];
        for(int i=0; i<count; i++){
            digits[i] = number%10;
            number/=10;
        }


		//Display the reverse number
        System.out.println("Reversed Number:");
        for(int i=0; i<count; i++){
            System.out.print(digits[i]);
        }
    }
}
