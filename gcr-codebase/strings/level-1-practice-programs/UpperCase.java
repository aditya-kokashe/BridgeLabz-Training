//Write a program to convert the complete text to uppercase and compare the results

import java.util.Scanner;
public class UpperCase{
    //Convert complete text to uppercase using ASCII logic
    public static String convertToUpperCase(String text){
        String result = "";
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            //if character is lowercase (a-z)
            if (ch>='a' && ch<='z'){
			    //Convert to uppercase
                ch=(char) (ch - 32);
            }
            result += ch;
        }
        return result;
    }
    //Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0; i<s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter complete text:");
        String text = sc.nextLine();

        //Built-in uppercase conversion
        String builtInUpper = text.toUpperCase();
        //User-defined uppercase conversion
        String customUpper = convertToUpperCase(text);
        //Compare uppercase results
        boolean upperResult = compareStrings(builtInUpper, customUpper);

		
		//Display the results
        System.out.println("\nUppercase Conversion:");
        System.out.println("Built-in toUpperCase(): " + builtInUpper);
        System.out.println("User-defined Uppercase: " + customUpper);
        System.out.println("Uppercase comparison result: " + upperResult);
    }
}