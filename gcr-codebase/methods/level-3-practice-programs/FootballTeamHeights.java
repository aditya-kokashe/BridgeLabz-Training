//Create a program to find the shortest, tallest, and mean height of players present in a football team.

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
        int teamSize = 11;
        int[] heights = new int[teamSize];
        //Generate random heights
        for(int i=0; i<heights.length; i++){
            heights[i] = (int)(Math.random()*101)+150;
        }
        //Calculate results
		int sum = findSum(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = findMean(heights);
		
		
        //Display results
		System.out.println("\nSum of all the heights: " + sum );
        System.out.println("Shortest Height: " + shortest );
        System.out.println("Tallest Height: " + tallest);
        System.out.println("Mean Height: " + mean);
    }
}

