import java.util.Scanner;
public class RemoveDuplicates{
	//Create method to find duplicates in a String
    public static String removeDuplicatesInString(String txt){
        String result = "";
		for(int i=0; i<txt.length(); i++){
		    if(result.indexOf(txt.charAt(i)) == -1){
			    result += txt.charAt(i);
			}
		}
		return result;
    }
	
	
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String : ");
		String txt = sc.next();
		
		//Access method removeDuplicatesInString
		String result = removeDuplicatesInString(txt);
		System.out.println("Modified string is: " + result);
	}
}