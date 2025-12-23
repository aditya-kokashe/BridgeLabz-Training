import java.util.Scanner;
public class RemoveSpecificCharacter{

    //Method to remove a specific character from a string
    public static String removeCharacter(String str, char ch){
        String result = "";
		//Iterate through the input String
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result = result + str.charAt(i);
            }
        }
        return result;
    }
	

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);


		//Display the result
        String modifiedString = removeCharacter(input, ch);
        System.out.println("Modified String: " + modifiedString);
        sc.close();
    }
}
