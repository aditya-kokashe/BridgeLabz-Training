import java.util.Scanner;
public class ToggleCase{

	//Create method to convert string into toggle case
    public static String convertIntoToggleCase(String text){
		String result = "";
		for(int i=0; i<text.length(); i++){
		    char ch = text.charAt(i);
		    if(Character.isUpperCase(ch)){
			    result += Character.toLowerCase(ch);
			}else if(Character.isLowerCase(ch)){
			    result += Character.toUpperCase(ch);
			}
		}
		return result;
    }
	
	
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter any String : ");
		String text = sc.nextLine();
		
		
		//Access method convertIntoToggleCase
		String result = convertIntoToggleCase(text);
		System.out.println("The toggle case of String "+text+" is "+result);
	}
}