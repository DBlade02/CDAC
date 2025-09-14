// 28. Write a program to calculate the product of the digits of a given number.
import java.util.Scanner;
public class ProductofSum {
    public static void main(String[] args) {
        System.out.println("Enter a number to calculate the product of its digits: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int product = 1;
        while(num > 0){
            int digit = num % 10; // Extracting the last digit
            product *= digit; // Multiplying the digit to product
            num /= 10; // Removing the last digit from the number
        }
        System.out.println("The product of the digits is: " + product);
    }    
}
