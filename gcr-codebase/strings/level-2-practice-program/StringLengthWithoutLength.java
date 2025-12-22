//Write a program to find and return the length of a string without using the length() method 

import java.util.Scanner;
public class StringLengthWithoutLength{
    public static int findLength(String text){
        int count = 0;
        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }catch(RuntimeException e){
            return count;
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        int customLength = findLength(text);
        int builtInLength = text.length();
		

		//Display the results
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in method: " + builtInLength);
        sc.close();
    }
}
