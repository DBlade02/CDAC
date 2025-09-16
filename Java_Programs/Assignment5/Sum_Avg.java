// Program to find sum and avg. of array elements
public class Sum_Avg {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        double avg = sum / (double) num.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
    
}
