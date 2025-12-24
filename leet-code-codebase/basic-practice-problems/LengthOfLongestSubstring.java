import java.util.Scanner;
public class LengthOfLongestSubstring{
	
	public static int findLength(String text){
		int maxLength = 0;
		//Iterate throug the String
		for(int i=0; i<text.length(); i++){
			for(int j=i; j<text.length(); j++){
				boolean hasRepeat = false;
				for(int k=i; k<j; k++){
					//Check if chars are equal
					if(text.charAt(k)==text.charAt(j)){
						hasRepeat = true;
						break;
					}
				}
				if(hasRepeat){
					break;
				}
				//Update thr length
				int currentLength = j-i+1;
				if(currentLength>maxLength){
					maxLength = currentLength;
				}
			}
		}
		return maxLength;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = sc.next();
		
		
		//Find the longest substring length
		int result = findLength(text);
		System.out.println("The length of longest substring without repeating characters is: "+ result);
	}
}