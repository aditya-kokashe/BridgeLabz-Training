import java.util.Scanner;
public class LongestWordInSentence{
	//Create method to find Longest Word In Sentence
    public static String findLongestWordInString(String text){
        String[] result = text.split(" ");
		String longestWord = "";
		for(int i=0; i<result.length; i++){
		    if(result[i].length() > longestWord.length()){
			    longestWord = result[i];
			}
		}
		return longestWord;
    }
	
	
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String : ");
		String text = sc.nextLine();
	
	
		//Access method findLongestWordInString
		String result = findLongestWordInString(text);		
		System.out.println("Longest word in sentence: "+result);
	}
}