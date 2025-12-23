import java.util.Scanner;
public class BMICalculator{
    //Calculate BMI and Status
    public static String[][] calculateBMIAndStatus(double[][] data) {
        String[][] result = new String[10][4];
        for(int i=0; i<10; i++){
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100;
            double bmi = weight / (heightM * heightM);
            String status;
            if (bmi < 18.5){
                status = "Underweight";
			}	
            else if (bmi < 25){
                status = "Normal";
			}	
            else if (bmi < 30){
                status = "Overweight";
			}	
            else{
                status = "Obese";
				result[i][0] = String.valueOf(heightCm);
				result[i][1] = String.valueOf(weight);
				result[i][2] = String.format("%.2f", bmi);
				result[i][3] = status;
			}	
        }

        return result;
    }
	//Display the results
    public static void displayResults(String[][] result) {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < result.length; i++) {
            System.out.println( result[i][0]+"\t\t"+result[i][1]+"\t\t"+
								result[i][2]+"\t\t"+result[i][3]);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();
        }
        String[][] result = calculateBMIAndStatus(data);
        displayResults(result);
        sc.close();
    }
}
