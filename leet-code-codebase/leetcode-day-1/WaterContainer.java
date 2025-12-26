import java.util.*;
public class WaterContainer{
	
	public static int mostWater(int[] heights){
		int maxWater = 0;
		int left = 0;
		int right = heights.length-1;
		//Iterate through the heights
		while(left<right){
			int width = right - left;
			int height = Math.min (heights[left], heights[right]);
			int currentWater = width * height;
			if(heights[left] < heights[right]){
				left++;
			}else{
				right--;
			}
			//Using Math to find maxWater capacity
			maxWater = Math.max(maxWater, currentWater);
		}
		return maxWater;
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of walls: ");
		int walls = sc.nextInt();
		int[] heights = new int[walls];
		System.out.println("Enter the height of walls: ");
		for(int i=0; i<heights.length; i++){
			heights[i] = sc.nextInt();
		}
		
		
		//Display the resulted water capacity
		int resultWater = mostWater(heights);
		System.out.println("You can store : " + resultWater + " capacity of water.");
	}
}