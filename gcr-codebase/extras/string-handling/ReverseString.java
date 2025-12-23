import java.util.Scanner;
public class ReverseString{
	public static String reverse(String text){
		String reversed = " ";
		for(int i=text.length()-1; i>=0; i--){
			reversed += text.charAt(i);
		}
		return reversed;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String text = sc.next();
		System.out.println(reverse(text));
	}
}