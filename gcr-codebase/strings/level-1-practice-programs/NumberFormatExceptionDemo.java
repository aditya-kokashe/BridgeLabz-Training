//Write a program to demonstrate NumberFormatException

import java.util.Scanner;
public class NumberFormatExceptionDemo{
    //Generate NumberFormatException
    static void generateException(String text){
        //Convert non-numeric text into integer
        int number = Integer.parseInt(text); //Exception occurs here
        System.out.println("Converted Number: " + number);
    }

    //Handle NumberFormatException using try-catch
    static void handleException(String text){
        try{
            int number = Integer.parseInt(text);
            System.out.println("Converted Number: " + number);
        }catch(NumberFormatException e){
            //Handles specific NumberFormatException
            System.out.println("NumberFormatException caught: Invalid number format.");
        }catch(RuntimeException e){
            //Handles any other runtime exception
            System.out.println("RuntimeException caught.");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value (text): ");
        String input = sc.next();


        //Calling method that handles exception
        handleException(input);
    }
}