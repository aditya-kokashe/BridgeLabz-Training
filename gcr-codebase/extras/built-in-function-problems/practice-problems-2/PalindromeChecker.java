import java.util.Scanner;
public class PalindromeChecker{

    //Method to take input from the user
    public static String getInput(Scanner sc){
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    //Method to check if the string is a palindrome
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        while(left<right){
            if(str.charAt(left) !=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    //Method to display the result
    public static void displayResult(String str, boolean result){
        if(result){
            System.out.println(str +" is a Palindrome");
        }else{
            System.out.println(str +" is Not a Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = getInput(sc);

		//Check for Palindrome
        boolean result = isPalindrome(input);
        displayResult(input, result);
    }
}
