import java.util.Scanner;
public class NumberGuessingGame{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("This is a Number Guessing Game");
		System.out.println("..............................");
		int attempts = 5;
		int resultNum = 50;
		
		do{
			//Guess attempt first
			System.out.print("Guess the number between (1 - 100): ");
			int numGuessed  = sc.nextInt();
			attempts--;
			
			//Check if the guessed number is equal to result number
			if(numGuessed == resultNum){
				System.out.println("You guessed it right!");
				break;
			}else if(numGuessed < resultNum){
				System.out.println("Too low");
			}else if(numGuessed > resultNum){
				System.out.println("Too high");
			}
		} while(attempts > 0);
		
		//If attempts are less than or equal to 0 then attempts are over
		if(attempts <= 0 ){
			System.out.println("Attempts over");
		}
	}
}