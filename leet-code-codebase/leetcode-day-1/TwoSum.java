import java.util.Scanner;
public class TwoSum{
	
	//Method to find the indexes to pair which gives target
	public static int[] twoSum(int[] nums, int target){
		//Using two loops to iterate through nums
		for(int i=0; i<nums.length; i++){
			for(int j=1; j<nums.length; j++){
				//Check if nums at i is equals to or not to j
				if(nums[i]+nums[j] == target){
					return new int[]{i,j};
				}
			}
		}
		return new int[]{};
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		System.out.println("Enter an array nums: ");
		for(int i=0; i<nums.length; i++){
			nums[i] = sc.nextInt();
		}
		System.out.print("Enter target: ");
		int target = sc.nextInt();
		
		
		//Store the output array in result
		int[] result = twoSum(nums, target);
		if(result.length>0){
			System.out.print("The pairs are at index: "+"["+result[0] +" "+ result[1]+"]");
		}
		else{
			System.out.println("pair not found!");
		}
	}
}