import java.util.Scanner;
public class PalindromeCheck{
	public static boolean isPalindrome(String text){
		//Finding if the text is palindrome 
		int start = 0;
		int end = text.length()-1;
		char[] ch = text.toCharArray();
		while(start< end){
			if(ch[start] != ch[end]){
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public static boolean compareChar(String text, int start, int end){
		//Find palindrome using recursive methods
		if(start>= end){
			return true;
		}
		if(text.charAt(start) != text.charAt(end)){
			return false;
		}
		return compareChar(text, start+1, end-1);
	}
	public static boolean usingCharArray(String text){
		//Find palindrome using Character array
		char[] original = text.toCharArray();
		char[] reverse = new char[original.length];
		int index = 0;
		for(int i=original.length-1; i>=0; i--){
			reverse[index++] = original[i];
		}
		for(int i=0; i<original.length; i++){
			if(original[i] != reverse[i]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = sc.nextLine();
		
		
		//Save and display the palindrome results
		boolean char1 = isPalindrome(text);
		boolean char2 = compareChar(text, 0, text.length()-1);
		boolean char3 = usingCharArray(text);
		System.out.println("Text is Palindrome using isPalindrome: " + char1);
		System.out.println("Text is Palindrome using Recursive method: " + char2);
		System.out.println("Text is Palindrome using Character array: " + char3);
	}
}