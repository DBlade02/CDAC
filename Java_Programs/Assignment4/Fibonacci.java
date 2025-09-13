//6. Write a program to print the Fibonacci series up to a given number of terms.
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter number of terms for Fibonacci series : ");
        Scanner scanner = new Scanner(System.in);
        int terms = scanner.nextInt();
        scanner.close();
        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int n1 = 0, n2 = 1;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        for (int i = 3; i <= terms; i++) {
            int sum = n1 + n2;
            System.out.print(sum + " ");
            n1 = n2;
            n2 = sum;
        }
        scanner.close();
    }
}
