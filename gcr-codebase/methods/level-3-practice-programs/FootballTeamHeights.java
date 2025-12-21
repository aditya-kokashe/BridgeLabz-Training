//Create a program to find the shortest, tallest, and mean height of players present in a football team.

import java.util.Scanner;
public class FootballTeamHeights{
    //Find sum of heights
    public static int findSum(int[] heights){
        int sum = 0;
        for(int height : heights){
            sum += height;
        }
        return sum;
    }
    //Find mean height
    public static double findMean(int[] heights){
        int sum = findSum(heights);
		double meanHeight = sum / heights.length;
        return meanHeight;
    }
    //Find shortest height
    public static int findShortest(int[] heights){
        int shortest = heights[0];
        for(int height : heights){
            if(height<shortest){
                shortest = height;
            }
        }
        return shortest;
    }
    //Find tallest height
    public static int findTallest(int[] heights){
        int tallest = heights[0];
        for(int height : heights){
            if(height>tallest){
                tallest = height;
            }
        }
        return tallest;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int teamSize = 11;
        int[] heights = new int[teamSize];
        //Take height input
        for(int i=0; i<heights.length; i++){
            System.out.print("Enter height of player " + (i + 1) +": ");
            heights[i] = input.nextInt();
        }
        //Display entered heights
        System.out.println("Heights of Football Team Players: ");
        for(int height : heights){
            System.out.print(height + " ");
        }
        //Calculate results
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = findMean(heights);
		
		
        //Display results
        System.out.println("\nShortest Height: " + shortest );
        System.out.println("Tallest Height: " + tallest);
        System.out.println("Mean Height: " + mean);
        input.close();
    }
}

