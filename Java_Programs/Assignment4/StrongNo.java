// 29. Write a program to check if a given number is a strong number.
import java.util.Scanner;
public class StrongNo {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if it is a Strong Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is a Strong Number.");
        } else {
            System.out.println(originalNum + " is not a Strong Number.");
        }
    }
}
