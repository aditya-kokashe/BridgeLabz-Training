//Write a Program to check if the given number is a prime number or not

import java.util.Scanner;
public class PrimeNumberCheck{
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean isPrime = false;
        //Check Prime numbers 
        if(number > 1){
            isPrime = true;
            //Check divisibility from 2 to number-1
            for(int i=2; i<number; i++) {
                if(number%i == 0){
                    isPrime = false;
                    break;
                }
            }
        }


        //Output result
        if (isPrime){
            System.out.println(number + " is a Prime Number");
        } else{
            System.out.println(number + " is Not a Prime Number");
        }
    }
}
