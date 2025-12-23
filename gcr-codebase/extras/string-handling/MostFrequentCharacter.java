import java.util.Scanner;
public class MostFrequentCharacter{

    //Method to find the most frequent character
    public static char findMostFrequentChar(String str){
        char[] chars = str.toCharArray();
        int maxCount = 0;
        char mostFrequent = chars[0];
		//Iterate through the string
        for(int i=0; i<chars.length; i++){
            int count = 1;
            for(int j=i+1; j<chars.length; j++){
                if(chars[i]==chars[j]){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount = count;
                mostFrequent = chars[i];
            }
        }
        return mostFrequent;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();


		//Check most frequent char int the input text
        char result = findMostFrequentChar(input);
        System.out.println("Most Frequent Character: '" + result + "'");
        sc.close();
    }
}
