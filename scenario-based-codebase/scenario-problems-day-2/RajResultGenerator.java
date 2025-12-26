import java.util.Scanner;
public class RajResultGenerator{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0;

		//Enter marks for each subject
        for(int i=1; i<=5; i++){
            System.out.print("Enter marks of subject " + i + ": ");
            total += sc.nextInt();
        }
        int average = total/5;
        char grade;

		//Grade based on average marks using switch
        switch(average/10){
            case 10:
            case 9:
				grade ='A'; 
				break;
            case 8:
				grade ='B'; 
				break;
            case 7: 
				grade ='C'; 
				break;
            case 6: 
				grade ='D'; 
				break;
            default: 
				grade ='F';
        }

		//Display calculated average marks and final grade
        System.out.println("Average Marks: "+ average);
        System.out.println("Grade: "+ grade);
    }
}
