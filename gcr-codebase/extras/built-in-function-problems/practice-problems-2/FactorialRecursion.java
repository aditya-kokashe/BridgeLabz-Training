import java.util.Scanner;
public class FactorialRecursion{

    //Method to take input
    public static int getInput(Scanner sc){
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    //Recursive method to calculate factorial
    public static long factorial(int n){
        //Base case
        if(n==0 || n==1){
            return 1;
        }
        //Recursive call
        return n * factorial(n-1);
    }

    //Method to display output
    public static void displayResult(int number, long result){
        System.out.println("Factorial of " + number + " is: " + result);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = getInput(sc);
		
		//Display the results
        if(number<0){
            System.out.println("Factorial is not defined for negative numbers.");
        }else{
            long result = factorial(number);
            displayResult(number, result);
        }
    }
}
