//Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 

import java.util.Scanner;
public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        // Check if the number is a natural number
        if(n <= 0) {
            System.out.println("Not a valid natural number");
        }else{
            int sumUsingLoop = 0;
            //Compute sum using for loop
            for (int i = 1; i <= n; i++) {
                sumUsingLoop += i;
            }
            //Compute sum using formula
            int sumUsingFormula = n * (n + 1) / 2;


            System.out.println("Sum using for loop: " + sumUsingLoop);
            System.out.println("Sum using formula: " + sumUsingFormula);
            //Compare results of for loop and formula
            if(sumUsingLoop == sumUsingFormula) {
                System.out.println("Both computations are correct");
            }else{
                System.out.println("Results do not match");
            }
        }
    }
}
