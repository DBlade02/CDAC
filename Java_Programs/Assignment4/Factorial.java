// 4. Write a program to find the factorial of a given number.
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter number to find factorial : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        else if (num == 0) {
            System.out.println("Factorial of 0 is 1.");
            return;
        }   
        int fact = 1;
        for(int i=1 ; i<=num ; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is : " + fact);
        sc.close();
    }   
}
