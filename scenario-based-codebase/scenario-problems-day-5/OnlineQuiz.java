/*
Online Quiz Application
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. 
● Apply clear indentation and structured layout.
*/

import java.util.Scanner;
public class OnlineQuiz{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
		//Array of questions
		String[] questions = {
			" What is the national bird of India?",
			" What is the national animal of India?",
			" What is the national food of India?",
			" What is the national currency of India?",
			" What is the national anthem of India?"
		};
		System.out.println("\n       * Emerald Quiz *");
		System.out.println("+-----------------------------+");
		
		//Array for ooptions
		String[] options = 
			{" 1. Chicken \n 2. Duck \n 3. Peacock \n 4. Peahen",
			" 1. Tiger \n 2. Bangal tiger \n 3. Tigress \n 4. Lion",
			" 1. Idli-sambhar \n 2. Dosa \n 3. Poha \n 4. Vada-pav",
			" 1. Paisa \n 2. Rupee \n 3. Doller \n 4. Dhiram",
			" 1. Vande matram \n 2. Jana gana mana \n 3. Mera bharat mahan \n 4. Dhoom machale"}
		;

		//Array for correct options
		int[] correctAns = {3,1,1,2,2};
		
		//Looping till 5 questions
		for(int i=0; i<questions.length; i++){
			System.out.println("\n Question: "+ questions[i]);
			System.out.println(options[i]);
			System.out.println();
			
			System.out.print(" Choose your answer: ");
			int selectOption = sc.nextInt();
			
			//Switch for checking answers
			switch(selectOption){
				case 1:
				case 2:
				case 3:
				case 4:
					if (selectOption == correctAns[i]){
						System.out.println(" Correct answer!!");
						score += 2;
					}else{
						System.out.println(" Wrong answer.");
					}
					break;
				default :
					System.out.println(" Invalid option");
					break;
			}	
		}
		
		//Display the total score
		System.out.println("+-----------------------------+");
		System.out.println("\n Total Score is: "+ score+ " out of 10");
	}
}