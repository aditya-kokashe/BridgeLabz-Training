/*Create a program to find the factors of a number taken as user input, store the factors in an array, 
and display the factors. Also find the sum, sum of square of factors and product of the 
factors and display the results
*/

import java.util.Scanner;
public class FactorsProgram{
    //Method to find factors and return them as an array
    static int[] findFactors(int num){
        int count = 0;
        //Count factors
        for(int i=1; i<=num; i++){
            if(num%i == 0){
                count++;
            }
        }
        //Initialize array with count
        int[] factors = new int[count];
        int index = 0;
        //Store factors in array
        for(int i=1; i<=num; i++){
            if(num%i== 0){
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }


    //Method to find sum of factors
    static int findSum(int[] factors){
        int sum = 0;
        for (int f : factors){
            sum += f;
        }
        return sum;
    }
    //Method to find product of factors
    static long findProduct(int[] factors){
        long product = 1;
        for (int f : factors){
            product *= f;
        }
        return product;
    }
    //Method to find sum of squares of factors
    static double findSumOfSquares(int[] factors){
        double sum = 0;
        for (int f : factors) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        //Find factors
        int[] factors = findFactors(num);
        //Display factors
        System.out.println("Factors are:");
        for(int f : factors){
            System.out.print(f + " ");
        }
        System.out.println();


        //Display results
        System.out.println("Sum of factors = " + findSum(factors));
        System.out.println("Product of factors = " + findProduct(factors));
        System.out.println("Sum of squares of factors = " + findSumOfSquares(factors));
        sc.close();
    }
}
