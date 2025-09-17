//Program to find sum of sqaures of odd index values

public class SumofsqofOddIndex {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 7, 4};
        int sum = 0;
        // Loop through odd indices (1, 3, 5, ...)
        for (int i = 0; i < arr.length; i += 2) {
            sum = sum + (arr[i] * arr[i]);
            System.out.println("arr[" + i + "] = " + arr[i] + ", square = " + (arr[i] * arr[i]));
        }
        System.out.println("Sum of squares of odd index elements: " + sum);
    }
}

