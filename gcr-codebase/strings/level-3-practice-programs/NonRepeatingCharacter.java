import java.util.Scanner;
public class NonRepeatingCharacter{
	public static char findFirstNonRepeatingCharacter(String text){
		int[] frequency = new int[256];
		//Count frequency of each character
		for(int i=0; i<text.length(); i++){
			char ch = text.charAt(i);
			frequency[ch]++;
		}
		//Find first non-repeating character
		for(int i=0; i<text.length(); i++){
			char ch = text.charAt(i);
			if (frequency[ch] == 1) {
				return ch;
			}
		}
		return '\0';
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = sc.nextLine();
		char result = findFirstNonRepeatingCharacter(text);
		
		
		//Display the non-repeating character
		if(result!='\0'){
			System.out.println("First non-repeating character is: " + result);
		}else{
			System.out.println("No non-repeating character found");
		}
		sc.close();
	}
}