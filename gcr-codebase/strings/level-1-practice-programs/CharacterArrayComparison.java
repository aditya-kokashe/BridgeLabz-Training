/*Write a program to return all the characters in a string using the user-defined method,  
compare the result with the String built-in toCharArray() method, and display the result*/

import java.util.Scanner;
public class CharacterArrayComparison{
    //Return characters without toCharArray
    public static char[] getCharacters(String text){
        char[] arr = new char[text.length()];
        for(int i=0; i<text.length(); i++){
            arr[i] = text.charAt(i);
        }
        return arr;
    }
    //Compare two char arrays
    public static boolean compareArrays(char[] a1, char[] a2){
        if(a1.length != a2.length){
            return false;
		}
        for(int i=0; i<a1.length; i++){
            if (a1[i] != a2[i]){
                return false;
			}
        }
        return true;
    }


    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        char[] customArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();
        boolean result = compareArrays(customArray, builtInArray);
		
		
        //Display result
        System.out.println("Characters using user-defined method:");
        for(char c:customArray){
            System.out.print(c + " ");
        }
        System.out.println("\nCharacters using toCharArray():");
        for(char c:builtInArray){
            System.out.print(c + " ");
        }
        System.out.println("\n\nAre both character arrays equal? " + result);
        sc.close();
    }
}