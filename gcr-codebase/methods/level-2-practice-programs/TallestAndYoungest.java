/*Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages 
and tallest among the friends based on their heights and display it
*/

import java.util.Scanner;
public class TallestAndYoungest{
    //Method to find index of youngest friend
    public static int findYoungest(int[] ages){
        int youngest = 0;
        for(int i=1; i<ages.length; i++){
            if(ages[i]<ages[youngest]){
                youngest = i;
            }
        }
        return youngest;
    }
    //Method to find index of tallest friend
    public static int findTallest(double[] heights){
        int tallest = 0;
        for(int i=1; i<heights.length; i++){
            if(heights[i]>heights[tallest]){
                tallest = i;
            }
        }
        return tallest;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        //Input age and height
        for(int i=0; i<friends.length; i++){
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter height of " + friends[i] + " (in cm): ");
            heights[i] = input.nextDouble();
        }
        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);
		
		
		//Display the youngest and tallest
        System.out.println("\nYoungest Friend: " + friends[youngest]);
        System.out.println("Tallest Friend: " + friends[tallest]);
        input.close();
    }
}

