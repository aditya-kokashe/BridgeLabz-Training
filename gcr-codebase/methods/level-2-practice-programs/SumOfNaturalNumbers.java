/*Write a program to find the sum of n natural numbers using recursive method and compare the result 
with the formulae n*(n+1)/2 and show the result from both computations is correct. 
*/

import java.util.Scanner;
public class SumOfNaturalNumbers{
    public static int recursiveSum(int n){
        if(n == 0){
			return 0;
		}
        return n+recursiveSum(n-1);
    }
    public static int formulaSum(int n){
        return n*(n+1)/2;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int n = input.nextInt();
        if(n>0){
            int sumRec = recursiveSum(n);
            int sumFormula = formulaSum(n);


			//Display 
            System.out.println("Recursive Sum: " + sumRec);
            System.out.println("Formula Sum: " + sumFormula);
        }
        input.close();
    }
}
