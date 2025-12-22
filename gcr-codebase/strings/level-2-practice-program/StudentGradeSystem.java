/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. 
Compute the percentage and then calculate the grade as shown in figure below*/

public class StudentGradeSystem{
    //Generate random PCM scores
    public static int[][] generateScores(int students){
        int[][] scores = new int[students][3];
        for(int i=0; i<students; i++){
            for(int j=0; j<3; j++){
				//2-digit marks
                scores[i][j] = 10 + (int) (Math.random() * 90); 
            }
        }
        return scores;
    }
    //Calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores){
        double[][] result = new double[scores.length][3];
        for(int i=0; i<scores.length; i++){
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;
            result[i][0] = total;
            result[i][1] = Math.round(avg * 100) / 100.0;
            result[i][2] = Math.round(perc * 100) / 100.0;
        }
        return result;
    }
    //Calculate grades and return 2D array
    public static String[][] calculateGrades(double[][] result){
        String[][] grades = new String[result.length][1];
        for(int i=0; i<result.length; i++){
            double perc = result[i][2];
            if(perc>=90){
                grades[i][0]="A";
			}	
            else if(perc>=75){
                grades[i][0]="B";
			}	
            else if(perc>=60){
                grades[i][0]="C";
			}	
            else{
                grades[i][0]="D";
			}	
        }
        return grades;
    }
	
	
    //Display scorecard
    public static void displayScoreCard(int[][] scores, double[][] result, String[][] grades){
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPerc\tGrade");
        for(int i=0; i<scores.length; i++){
            System.out.println(scores[i][0] + "\t" + scores[i][1] + "\t" +scores[i][2] + "\t" +
                result[i][0] + "\t" + result[i][1] + "\t" + result[i][2] + "\t" + grades[i][0]
            );
        }
    }


    public static void main(String[] args){
        int students = 5;
        int[][] scores = generateScores(students);
        double[][] result = calculateResults(scores);
        String[][] grades = calculateGrades(result);
        displayScoreCard(scores, result, grades);
    }
}
