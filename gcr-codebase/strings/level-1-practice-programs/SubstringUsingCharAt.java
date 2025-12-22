/*Write a program to create a substring from a String using the charAt() method. 
Also, use the String built-in method substring() to find the substring of the text. 
Finally Compare the the two strings and display the results*/

import java.util.Scanner;
public class SubstringUsingCharAt{
    //Create substring using charAt
    public static String substringUsingCharAt(String text, int start, int end){
        String result = "";
        for (int i=start; i<end; i++){
            result += text.charAt(i);
        }
        return result;
    }
    //Compare strings using charAt
    public static boolean compareStrings(String s1, String s2){
        if (s1.length()!=s2.length())
            return false;
        for(int i=0; i<s1.length(); i++){
            if (s1.charAt(i)!=s2.charAt(i))
                return false;
        }
        return true;
    }
	
	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String customSub = substringUsingCharAt(text, start, end);
        String builtInSub = text.substring(start, end);


		//Display the results
        System.out.println("Substring using charAt(): " + customSub);
        System.out.println("Substring using substring(): " + builtInSub);
        System.out.println("Both are equal: " + compareStrings(customSub, builtInSub));
        sc.close();
    }
}
