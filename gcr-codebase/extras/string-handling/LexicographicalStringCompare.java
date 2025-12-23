import java.util.Scanner;
public class LexicographicalStringCompare{

    //Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        //Compare character by character
        for(int i=0; i<minLength; i++){
            if(str1.charAt(i) != str2.charAt(i)){
				int result =  str1.charAt(i) - str2.charAt(i);
                return result;
            }
        }
        return str1.length() - str2.length();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();


        int result = compareStrings(str1, str2);
        if(result<0){
            System.out.println(str1 + " comes before " + str2 + " in lexicographical order");
        } 
        else if(result>0){
            System.out.println(str1 + " comes after " + str2 + " in lexicographical order");
        } 
        else{
            System.out.println("Both strings are equal");
        }
        sc.close();
    }
}
