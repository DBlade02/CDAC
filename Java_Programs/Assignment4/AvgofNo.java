//17. Write a program to calculate the average of a list of numbers.
public class AvgofNo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Example list of numbers
        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;
        System.out.println("The average is: " + average);
    }
}
