import java.util.Scanner;
public class UniqueCharacterString{
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = sc.nextLine();
		char[] uniqueChars = findUniqueCharacters(text);


		//Display the results
		System.out.println("Unique characters in the string: ");
		for(int i=0; i<uniqueChars.length; i++){
			System.out.print(uniqueChars[i] + " ");
		}
		sc.close();
	}

}