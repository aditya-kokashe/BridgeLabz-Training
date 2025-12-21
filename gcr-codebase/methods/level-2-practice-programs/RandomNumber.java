/*Write a program that generates five 4 digit random values and then finds their average value, 
and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().*/

public class RandomNumber{
    // Generate array of 4 digit random numbers
    public static int[] generate4DigitRandomArray(int size){
        int[] numbers = new int[size];
        for (int i=0; i<size; i++){
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return numbers;
    }
    //Find average, minimum, and maximum
    public static double[] findAverageMinMax(int[] numbers){
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int num : numbers){
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        double average = (double) sum/numbers.length;
        return new double[]{average, min, max};
    }


    public static void main(String[] args){
        int[] randomNumbers = generate4DigitRandomArray(5);
        //Display numbers
        System.out.print("Generated 4-digit numbers: ");
        for (int num : randomNumbers){
            System.out.print(num + " ");
        }
        double[] result = findAverageMinMax(randomNumbers);


		//Display the results
        System.out.println("\nAverage: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}