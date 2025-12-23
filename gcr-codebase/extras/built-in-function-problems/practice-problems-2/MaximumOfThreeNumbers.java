import java.util.Scanner;
public class MaximumOfThreeNumbers{

    //Method to find maximum of three numbers
    public static int findMaximum(int a, int b, int c){
        int max = a;
        if(b>max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        return max;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Take three numbers from user
        System.out.print("Enter first number: ");
        int a= sc.nextInt();
        System.out.print("Enter second number: ");
        int b= sc.nextInt();
        System.out.print("Enter third number: ");
        int c= sc.nextInt();


        //Call method to find maximum
        int max= findMaximum(a,b,c);
        //Display result
        System.out.println("Maximum number is: " + max);
    }
}