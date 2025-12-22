/*Write a program to generate a six-digit OTP number using Math.random() method. 
Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
*/

public class OTPCheck{
	//Generate unique numbers for OTP
	public static int[] otpGenerator(int number){
		int[] otp = new int[number];
		for(int i=0; i<otp.length; i++){
            otp[i] = (int)(Math.random()*1000001);
        }
		return otp;
	}
	//Check if the OTPs are unique
	public static boolean otpCheck(int[] number){
		boolean check = true; 
		for(int i=0; i<number.length ; i++){
			for(int j=i+1; j<number.length; j++){
				if(number[i] == number[j]){
					check = false;
					break;
				}
			}
			if(check == false){
				break;
			}
		}
		return check;
	}
	
	
	public static void main(String[] args){
		int[] otp = otpGenerator(10);
		boolean result = otpCheck(otp);
		
		
		//Display the random OTPs
		for(int n=0; n<otp.length; n++){
			System.out.print(otp[n] + " ");
		}
		//Display the results 
		if(result){
			System.out.print("\nYes all OTPs are unique");
		}else{
			System.out.print("No the OTPs are not unique");
		}
	}
}