//Write a program to demonstrate StringIndexOutOfBoundsException

import java.util.Scanner;
public class StringIndexOutOfBoundsDemo{
    //Generate StringIndexOutOfBoundsException
    static void generateException(String text){
        //Accessing character beyond string length
        System.out.println(text.charAt(text.length()));
    }
    //Handle StringIndexOutOfBoundsException
    static void handleException(String text){
        try{
            //Trying to access invalid index
            System.out.println(text.charAt(text.length()));
        }catch(StringIndexOutOfBoundsException e){
            //Handling runtime exception
            System.out.println("StringIndexOutOfBoundsException handled");
            System.out.println("Error Message: " + e.getMessage());
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();


        //Handling the exception safely
        handleException(input);
        sc.close();
    }
}