/* 11. Temperature Logger 
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.
*/

import java.util.*;
public class TemperatureLogger{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		double maxTemp = 0;
		System.out.println("\t    Temperature Logger");
		System.out.println("+-------------------------------------------+");
		
		//Take input temperature of seven days
		double[] days = new double[7];
		for(int i=0; i<days.length; i++){
			System.out.print("Enter Temperature for day "+(i+1)+" in celcius : ");
			days[i] = sc.nextInt();
			sum += days[i];
		}
		
		//Calculate average and max temperature
		double avg = sum/7;
		for(int i=0; i<days.length; i++){
			if(maxTemp < days[i]){
				maxTemp = days[i];
			}
		}
		
		//Display average and max temperature
		System.out.println("+-------------------------------------------+");
		System.out.printf("Average temperature: \t%.2f Celcius.%n", avg);
		System.out.println("Maximum Temperature: \t"+ maxTemp +" Celcius.");
		System.out.println("+-------------------------------------------+");
	}
}	