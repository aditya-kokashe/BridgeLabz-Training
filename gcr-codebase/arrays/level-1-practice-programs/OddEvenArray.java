/*Create a program to save odd and even numbers into odd and even arrays between 1 to the 
number entered by the user. Finally, print the odd and even numbers array*/


import java.util.Scanner;
public class OddEvenArray{
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        //Check for natural number
        if(number<=0){
            System.out.println("Not a valid Natural number");
            return;
        }
        //Create even and odd arrays
        int[] evenArray = new int[(number / 2) + 1];
        int[] oddArray = new int[(number / 2) + 1];
        int evenIndex = 0;
        int oddIndex = 0;
        //Store odd and even numbers
        for(int i=1; i<=number; i++){
            if(i%2==0){
                evenArray[evenIndex] = i;
                evenIndex++;
            }else{
                oddArray[oddIndex] = i;
                oddIndex++;
            }
        }


        //Print even numbers
        System.out.println("Even Numbers: ");
        for(int i=0; i<evenIndex; i++) {
            System.out.print(evenArray[i] + " ");
        }
        //Print odd numbers
        System.out.println("\nOdd Numbers: ");
        for(int i=0; i<oddIndex; i++){
            System.out.print(oddArray[i] + " ");
        }
    }
}
