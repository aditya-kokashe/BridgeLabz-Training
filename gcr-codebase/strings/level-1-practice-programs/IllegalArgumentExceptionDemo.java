//Write a program to demonstrate IllegalArgumentException

import java.util.Scanner;
public class IllegalArgumentExceptionDemo{
    //Generate IllegalArgumentException
    static void generateException(String text){
        //Start index is greater than end index
        System.out.println(text.substring(5,2));
    }
	
    //Handle IllegalArgumentException
    static void handleException(String text){
        try{
            //Invalid substring range
            System.out.println(text.substring(5, 2));
        }catch(IllegalArgumentException e){
            //Handling IllegalArgumentException
            System.out.println("IllegalArgumentException handled");
            System.out.println("Error Message: " + e.getMessage());
        }catch(RuntimeException e){
            //Handling any other runtime exception
            System.out.println("RuntimeException handled");
            System.out.println("Error Message: " + e.getMessage());
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();


        //Handling the exception safely
        handleException(input);
    }
}