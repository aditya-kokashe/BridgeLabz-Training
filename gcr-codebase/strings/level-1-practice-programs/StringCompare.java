//Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method

import java.util.Scanner;
public class StringCompare{
	//Compare using charAt() method
	public static boolean compareWithCharAt(String s1, String s2){
		int len1 = s1.length();
		int len2 = s2.length();
		boolean check = true;
		//Checking length of strings
		if(len1 == len2){		
			for(int i=0 ; i<len1 ; i++){
				if(s1.charAt(i) != s2.charAt(i)){
					check = false;
					break;
				}
			}
		}else{
			check = false;
		}
		return check;
	}
	//Compare with built-in String equals() method
	public static boolean compareWithEquals(String s1, String s2){
		return  s1.equals(s2);
	} 
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String str1 = sc.next();
		System.out.print("Enter second string: ");
		String str2 = sc.next();
		boolean methodCharAt = compareWithCharAt(str1, str2);
		boolean methodEquals = compareWithEquals(str1, str2);
		
		
		//Display the comparison
		if(methodCharAt==methodEquals){
			if(methodCharAt == false){
				System.out.println("not equal");
			}else{
				System.out.println("equal");
			}
		}else{
			System.out.println("not");
		}
	}
}