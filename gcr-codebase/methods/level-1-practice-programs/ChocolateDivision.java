/*Create a program to divide N number of chocolates among M children. Print the number of chocolates each child 
will get and also the remaining chocolates*/

import java.util.Scanner;
public class ChocolateDivision{
    //Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int[] result = new int[2];
		//quotient (chocolates per child)
        result[0] = number/divisor;
		//remainder (remaining chocolates)
        result[1] = number%divisor; 
        return result;
    }

	
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();
		
		
		//Display number of chocolates each child will get and also the remaining chocolates
        if(numberOfChildren<=0){
            System.out.println("Number of children must be greater than zero.");
        }else{
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }
    }
}
