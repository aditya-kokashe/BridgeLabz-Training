import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic{

    //Method to perform date calculations
    public static LocalDate calculateDate(LocalDate date){
        //Add 7 days, 1 month,and 2 years
        LocalDate updatedDate=date.plusDays(7).plusMonths(1).plusYears(2);
        //Subtract 3 weeks
        updatedDate=updatedDate.minusWeeks(3);
        return updatedDate;
    }
	

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (YYYY-MM-DD): ");
        String inputDate = sc.nextLine();
        LocalDate date = LocalDate.parse(inputDate);
        LocalDate finalDate = calculateDate(date);

		//Display the results
        System.out.println("Original Date : " +date);
        System.out.println("Final Date after calculations : " +finalDate);
    }
}
