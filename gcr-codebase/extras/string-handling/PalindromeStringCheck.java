import java.util.Scanner;
public class PalindromeStringCheck{
	public static boolean isPalindrome(String text){
		int left = 0;
		int right = text.length()-1;
		//Check palindrome
		while(left< right){
			char a = Character.toLowerCase(text.charAt(left));
			char b = Character.toLowerCase(text.charAt(right));
			if(a==b){
				return true;
			}
			left++;
			right--;
		}
		return false;
	}
	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = sc.next();
		
		//Check the String is palindrome or not
		System.out.println(isPalindrome(text));
	}
}