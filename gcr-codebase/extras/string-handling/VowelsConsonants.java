import java.util.Scanner;
public class VowelsConsonants{
    static void countVC(String str){
        int vowels = 0, consonants = 0;
		//Loop through the String
        for(int i=0; i<str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));
			//Check for vowels and consonants
            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowels++;
				}	
                else{
                    consonants++;
				}	
            }
        }


        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a text: ");
        String input = sc.nextLine();
        countVC(input);
    }
}
