import java.util.Scanner;
public class AnagramCheck{

    //Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2){
        //Remove spaces and convert to lowercase
        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();
        //If lengths differ, they can't be anagrams
        if(str1.length()!=str2.length()){
            return false;
        }
		//ASCII characters
        int[] frequency = new int[256]; 
        //Increase count for first string
        for(int i=0; i<str1.length(); i++){
            frequency[str1.charAt(i)]++;
        }
        //Decrease count for second string
        for(int i=0; i<str2.length(); i++){
            frequency[str2.charAt(i)]--;
        }
        //Check if all counts are zero
        for(int i=0; i<frequency.length; i++){
            if(frequency[i]!=0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();


		//Display the results
        if(areAnagrams(str1, str2)){
            System.out.println("The strings are anagrams");
        }else{
            System.out.println("The strings are not anagrams");
        }
        sc.close();
    }
}
