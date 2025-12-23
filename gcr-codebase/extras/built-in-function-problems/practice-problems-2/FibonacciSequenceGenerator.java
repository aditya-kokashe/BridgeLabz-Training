import java.util.Scanner;
public class FibonacciSequenceGenerator{

    //Method to calculate and print Fibonacci sequence
    public static void printFibonacci(int terms){
        if(terms<=0){
            System.out.println("Please enter a positive number of terms.");
            return;
        }
        int first = 0;
		int second = 1;
        System.out.print("Fibonacci Sequence: ");
        if(terms>=1){
            System.out.print(first + " ");
        }
        if(terms>=2){
            System.out.print(second + " ");
        }
        for(int i=3; i<=terms; i++){
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();
		
		
		//Display the result
        printFibonacci(terms);
    }
}
