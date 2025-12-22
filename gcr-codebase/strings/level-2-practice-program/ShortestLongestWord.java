/*Write a program to split the text into words and find the shortest and longest strings in a given text
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the 
String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. 
Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, 
find the shortest and longest string and return them in an 1D int array. 
The main function calls the user-defined methods and displays the result. 
*/

import java.util.Scanner;
public class ShortestLongestWord{
    //Find length without using length()
    public static int findLength(String text){
        int i = 0;
        try{
            while(true){
                text.charAt(i);
                i++;
            }
        }catch(Exception e){
            return i;
        }
    }
    //Split text into words without using split()
    public static String[] splitText(String text){
        int length = findLength(text);
        int count = 1;
        for(int i=0; i<length; i++){
            if(text.charAt(i) == ' '){
                count++;
			}
        }
        String[] words = new String[count];
        int start = 0, idx = 0;
        for(int i=0; i<=length; i++){
            if(i==length || text.charAt(i) == ' '){
                String word = "";
                for(int j=start; j<i; j++){
                    word += text.charAt(j);
                }
                words[idx++] = word;
                start = i + 1;
            }
        }
        return words;
    }
    //Create 2D array of word and its length
    public static String[][] wordLength2D(String[] words){
        String[][] data = new String[words.length][2];
        for(int i=0; i<words.length; i++){
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }
        return data;
    }
    //Find shortest and longest using 2D array
    public static int[] findShortestLongest(String[][] data){
        int min = Integer.parseInt(data[0][1]);
        int max = min;
        for(int i=0; i<data.length; i++){
            int len = Integer.parseInt(data[i][1]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] words = splitText(text);
        String[][] wordData = wordLength2D(words);
        int[] result = findShortestLongest(wordData);


        // Display results
        System.out.println("Shortest length: " + result[0]);
        System.out.println("Longest length: " + result[1]);
        sc.close();
    }
}

