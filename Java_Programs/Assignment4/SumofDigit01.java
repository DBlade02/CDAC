//36. Write a program to find the sum of the digits of a given number until the sum is a single digit.
import java.util.Scanner;
public class SumofDigit01 {
    public static void main(String[] args) {
        System.err.println("Enter a number to find the sum of its digits until a single digit is obtained: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int sum = 0;
        while (num > 0 || sum > 9) {
            if (num == 0) {
                num = sum; 
                sum = 0; 
            }
            sum += num % 10;
            num /= 10;
        }

        System.out.println("The single-digit sum is: " + sum);
    }
    
}
