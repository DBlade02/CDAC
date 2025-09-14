// 14. Write a program to find GCD of two numbers.
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        System.out.println("Enter two numbers to find GCD");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        if(num1 <= 0 || num2 <= 0) {
            System.out.println("Please enter positive integers only.");}
        scanner.close();
        int gcd = 1;
        for(int i=1; i<=num1 && i<=num2; i++){
            if(num1%i ==0 && num2%i ==0){
                gcd = i;
            }
        }
        System.out.println("GCD of " + num1 + " and " + num2 + " is : " + gcd);
        scanner.close();
    }
}
