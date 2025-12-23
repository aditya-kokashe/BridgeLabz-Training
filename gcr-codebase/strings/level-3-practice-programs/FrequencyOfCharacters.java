import java.util.Scanner;
public class FrequencyOfCharacters{
	public static void findFrequency(String text){
		int[] frequency = new int[256];
		//Count frequency of each character
		for(int i=0; i<text.length(); i++){
			char ch = text.charAt(i);
			frequency[ch]++;
		}
		
		
		//Display the characters and their frequency
		System.out.println("Character Frequency: ");
		for(int i=0; i<256; i++){
			if(frequency[i] > 0){
				System.out.println((char)i+" : " + frequency[i]);
			}
		}
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = sc.nextLine();
		//Call the method for the text input
		findFrequency(text);
		sc.close();
	}
}