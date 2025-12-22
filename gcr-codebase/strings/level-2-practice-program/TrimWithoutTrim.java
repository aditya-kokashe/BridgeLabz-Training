//Write a program to trim the leading and trailing spaces from a string using the charAt() method 

import java.util.Scanner;
public class TrimWithoutTrim{
    public static int[] findTrimIndexes(String text){
    int start = 0;
    int end = text.length() - 1;
    //Trim leading spaces
    while(start<=end && text.charAt(start)==' '){
        start++;
	}
    //Trim trailing spaces
    while(end>=start && text.charAt(end)==' '){
        end--;
	}
    return new int[]{start, end + 1};
	}
    public static String substringUsingCharAt(String text, int start, int end){
        String result = "";
        for(int i=start; i<end; i++){
            result += text.charAt(i);
		}	
        return result;
    }
    public static boolean compareStrings(String a, String b){
        if(a.length()!=b.length()){
            return false;
		}
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)!=b.charAt(i)){
                return false;
			}	
		}
        return true;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        int[] idx = findTrimIndexes(text);
        String customTrim = substringUsingCharAt(text, idx[0], idx[1]);
        String builtInTrim = text.trim();
        boolean result = compareStrings(customTrim, builtInTrim);


		//Display the results
        System.out.println("\nCustom Trim Result : [" + customTrim + "]");
        System.out.println("Built-in Trim Result: [" + builtInTrim + "]");
        System.out.println("Comparison Result  : " + result);
    }
}