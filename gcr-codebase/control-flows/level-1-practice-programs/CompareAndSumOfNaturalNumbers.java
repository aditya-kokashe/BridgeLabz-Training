/*Write a program to find the sum of n natural numbers using while loop compare the result 
with the formulae n*(n+1)/2 and show the result from both computations was correct. */

import java.util.Scanner;
public class CompareAndSumOfNaturalNumbers{
    public static void main(String[] args){
		
	
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        //Check if n is a natural number
        if (n <= 0){
            System.out.println("Not a Natural number.");
        }else{
            //Sum using while loop
            int sumWhile = 0;
            int i = 1;
            while (i <= n){
                sumWhile = sumWhile + i;
                i++;
            }
            //Sum using formula
            int sumFormula = n * (n + 1) / 2;


            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula: " + sumFormula);
            //Compare results of sum using while and sum using formula
            if (sumWhile == sumFormula){
                System.out.println("Both results are correct and match");
            } else {
                System.out.println("Results do not match");
            }
        }
    }
}
