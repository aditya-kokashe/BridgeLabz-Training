import java.util.Scanner;
public class WordLength2DArray{
    //Split text into words using charAt()
    public static String[] splitText(String text){
        int count = 0;
        //Count words
        boolean inWord = false;
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)!=' ' && !inWord){
                count++;
                inWord = true;
            }else if(text.charAt(i) == ' '){
                inWord = false;
            }
        }
        String[] words = new String[count];
        int index = 0;
        String word = "";
        for (int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else if (!word.equals("")) {
                words[index++] = word;
                word = "";
            }
        }
        //Store last word
        if (!word.equals("")) {
            words[index] = word;
        }
        return words;
    }
    //Find length of a string without using length()
    public static int findLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }
    //Create 2D array of word and its length
    public static String[][] createWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len);
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] words = splitText(text);
        String[][] wordLengthArray = createWordLengthArray(words);


        System.out.println("\nWord\tLength");
        for (int i = 0; i < wordLengthArray.length; i++) {
            int length = Integer.parseInt(wordLengthArray[i][1]);
            System.out.println(wordLengthArray[i][0] + "\t" + length);
        }
    }
}
