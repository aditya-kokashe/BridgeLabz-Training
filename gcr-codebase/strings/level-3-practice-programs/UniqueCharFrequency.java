/*Write a program to find the frequency of characters in a string using 
unique characters and display the result*/

import java.util.Scanner;
public class UniqueCharFrequency{
	//Find the length of the text
	public static int findLength(String text){
    int count = 0;
		try{
			while(true){
				text.charAt(count);
				count++;
			}
		}catch(Exception e){
			//exception
		}
		return count;
	}
	public static char[] findUniqueCharacters(String text){
		int length = findLength(text);
		char[] temp = new char[length];
		int uniqueCount = 0;
		//Check unique characters
		for(int i=0; i<length; i++){
			char currentChar = text.charAt(i);
			boolean isUnique = true;
			for(int j=0; j<i; j++){
				if(currentChar == text.charAt(j)){
					isUnique = false;
					break;
				}
			}
			if(isUnique){
				temp[uniqueCount] = currentChar;
				uniqueCount++;
			}
		}
		//Create exact-sized array for unique characters
		char[] result = new char[uniqueCount];
		for(int i=0; i<uniqueCount; i++) {
			result[i] = temp[i];
		}
		return result;
	}
	public static String[][] frequencyUsingCharAt(String text){
		int[] frequency = new int[256];
		for(int i=0; i<text.length(); i++){
			char ch = text.charAt(i);
			frequency[ch]++;
		}
		char[] uniqueChars = findUniqueCharacters(text);
		String[][] result = new String[uniqueChars.length][2];
		for(int i=0; i<uniqueChars.length; i++){
			char ch = uniqueChars[i];
			result[i][0] = String.valueOf(ch);
			result[i][1] = String.valueOf(frequency[ch]);
		}
		return result;
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = sc.nextLine();
		String[][] result = frequencyUsingCharAt(text);
		//Display the characters and their frequency
		System.out.println("Character\tFrequency");
		for(int i=0; i<result.length ;i++){
			System.out.println(result[i][0]+"\t\t"+ result[i][1]);
		}
		sc.close();
	}
}