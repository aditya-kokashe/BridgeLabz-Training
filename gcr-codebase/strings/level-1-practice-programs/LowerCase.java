//Write a program to convert the complete text to lowercase and compare the results

import java.util.Scanner;
public class LowerCase{
    //Convert complete text to lowercase using ASCII logic
    public static String convertToLowerCase(String text){
        String result = "";

        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);

            //If character is uppercase (A-Z)
            if(ch>='A' && ch<='Z'){
			    //Convert to lowercase
                ch = (char) (ch + 32); 
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


        //Built-in lowercase conversion
        String builtInLower = text.toLowerCase();
        // User-defined lowercase conversion
        String customLower = convertToLowerCase(text);
        //Compare lowercase results
        boolean lowerResult = compareStrings(builtInLower, customLower);

		//Display the results
        System.out.println("\nLowercase Conversion:");
        System.out.println("Built-in toLowerCase(): " + builtInLower);
        System.out.println("User-defined Lowercase: " + customLower);
        System.out.println("Lowercase comparison result: " + lowerResult);
    }
}