import java.util.Scanner;
public class ValidBrackets{
	public static boolean validBrackets(String text){
		int parentheses = 0;
		int brackets = 0;
		int braces = 0;
		for(int i=0; i<text.length(); i++){
			char ch = text.charAt(i);
			switch (ch){
				case '(' :
					parentheses++;
					break;
				case ')' :
					parentheses--;
					break;
				case '{' :
					braces++;
					break;
				case '}' :
					braces--;
					break;
				case '[' :
					brackets++;
					break;
				case ']' :
					brackets--;
					break;	
			}
		}
		return parentheses == 0 && braces == 0 && brackets == 0;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter brackets: ");
		String text = sc.next();
		boolean result = validBrackets(text);
		
		
		if(result){
			System.out.println("The input string is valid");		
		}else{
			System.out.println("Not valid string!!");
		}
	}
}
