// 11. Write a program to check if a given number is Armstrong.
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter number to check its Armstrong or not : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Please enter a non-negative number.");
            return;
        }
        scanner.close();
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        System.out.println("Sum of digits raised to the power " + digits + " is : " + sum);
        if (originalNum == sum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
        scanner.close();
        
    }
    
}
