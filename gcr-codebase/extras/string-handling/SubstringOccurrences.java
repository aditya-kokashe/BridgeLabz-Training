import java.util.Scanner;
public class SubstringOccurrences{

	//Create method to find substring occurrences
    public static int findSubstringOccurrences(String text, String subStr){
		int count = 0;
		
		for(int i=0; i<= text.length()-subStr.length(); i++){
		    if(text.substring(i, i+subStr.length()).equals(subStr)){
			    count++;
			}
		}
		return count;
    }
	
	
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String : ");
		String text = sc.nextLine();
		System.out.print("Enter Sub String : ");
		String subStr= sc.nextLine();
		
		
		//Access method findLongestWordInString
		int result = findSubstringOccurrences(text, subStr);
		System.out.println("Substring occurrences "+result);
	}
}