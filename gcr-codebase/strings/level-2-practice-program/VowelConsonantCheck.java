/*Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, 
or Not a Letter*/

import java.util.Scanner;
public class VowelConsonantCheck{
    public static String checkChar(char ch){
        if(ch>='A' && ch<='Z'){
            ch = (char) (ch + 32);
		}	
        if(ch>='a' && ch<='z'){
            if("aeiou".indexOf(ch) != -1){
                return "Vowel";
			}	
            return "Consonant";
        }
        return "Not a Letter";
    }
    public static String[][] analyzeText(String text){
        String[][] data = new String[text.length()][2];
        for(int i=0; i<text.length(); i++){
            data[i][0] = String.valueOf(text.charAt(i));
            data[i][1] = checkChar(text.charAt(i));
        }
        return data;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[][] result = analyzeText(text);


		//Display the results
        System.out.println("Char\tType");
        for(String[] row : result){
            System.out.println(row[0] + "\t" + row[1]);
		}	
        sc.close();
    }
}
