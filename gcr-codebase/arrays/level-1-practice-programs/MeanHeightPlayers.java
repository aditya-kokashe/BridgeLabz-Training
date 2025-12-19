//Create a program to find the mean height of players present in a football team.

import java.util.Scanner;
public class MeanHeightPlayers{
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		double[] heights = new double[11];
		double sum = 0;
		double meanHeight = 0;
		System.out.println("Enter height of player 1 to 11: ");
		//Find the mean height of footballers
		for(int i=0; i<heights.length ; i++){
			heights[i] = sc.nextDouble();
			sum += heights[i];
			meanHeight = sum/11;
		}
		
		
		//Display the mean height of the 11 players in a football team
		System.out.println("Mean height: "+ meanHeight);
	}
}