import java.util.Scanner;
public class AnagramCheck{
	//Check length of the two strings
	public static boolean checkLength(String text1, String text2){
		boolean isEqual = text1.length()==text2.length();
		return isEqual;
	}
	//Check for anagrams
	public static boolean isAnagram(String text1, String text2){
		if(!checkLength(text1, text2)){
			return false;
		}
		int[] freq = new int[256];
		for(int i=0; i<text1.length(); i++){
			freq[text1.charAt(i)]++;
		}
		for(int i=0; i<text2.length(); i++){
			freq[text2.charAt(i)]--;
		}
		for(int i=0; i<256; i++){
			if(freq[i] !=0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text1 = sc.nextLine();
		System.out.print("Enter a text: ");
		String text2 = sc.nextLine();
		
		
		//Display the results
		if(isAnagram(text1, text2)){
			System.out.println("The strings are Anagrams");
		}else{
			System.out.println("The strings are NOT Anagrams");
		}
	}
}