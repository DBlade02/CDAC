// 35. Write a program to check if a given number is a perfect square.
import java.util.Scanner;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find all perfect squares up to that number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Perfect squares between 1 and " + n + " are:");
        for (int i = 1; i * i <= n; i++) {
            System.out.print((i * i) + " ");
        }
    }
}
