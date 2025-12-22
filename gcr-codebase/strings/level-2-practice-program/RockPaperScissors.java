/*Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose 
either rock, paper, or scissors. */

import java.util.Scanner;
public class RockPaperScissors{
    //Generate computer choice
    public static String computerChoice(){
        int r = (int) (Math.random()*3);
        return (r == 0) ? "rock" : (r == 1) ? "paper" : "scissors";
    }
    //1=user wins, -1=computer wins, 0=draw
    public static int findWinner(String user, String comp){
        if(user.equals(comp)){
            return 0;
		}
        if((user.equals("rock") && comp.equals("scissors")) || (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))){
            return 1;
		}	
        return -1;
    }
    //Calculate stats and percentage
    public static String[][] calculateStats(int userWins, int compWins, int games){
        String[][] stats = new String[2][3];
        double userPercent = (userWins * 100.0) / games;
        double compPercent = (compWins * 100.0) / games;
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent);
        stats[1][0] = "Comp";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", compPercent);
        return stats;
    }
    //Display results
    public static void displayResults(String[][] stats){
        System.out.println("\nPlayer\tWins\tWin Percentage");
        for(int i=0; i<stats.length; i++){
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" +stats[i][2] + "%");
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        int userWins = 0, compWins = 0;


        for(int i=1; i<=games; i++){
            System.out.print("\nGame " + i + " - Enter choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();
            String comp = computerChoice();
            int result = findWinner(user, comp);
            System.out.println("Computer chose: " + comp);
            if(result==1){
                System.out.println("Result: User wins");
                userWins++;
            }else if(result == -1){
                System.out.println("Result: Computer wins");
                compWins++;
            }else{
                System.out.println("Result: Draw");
            }
        }
        String[][] stats = calculateStats(userWins, compWins, games);
        displayResults(stats);
    }
}
