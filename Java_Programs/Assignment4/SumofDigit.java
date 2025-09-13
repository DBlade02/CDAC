// 7. Write a program to calculate the sum of digits of a given number.
import java.util.Scanner;
public class SumofDigit {
    public static void main(String[] args) {
        System.out.println("Enter number to find sum of digits : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int sum = 0;
        for(int i=0 ; num>0 ; i++){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;            
        }
        System.out.println("Sum of digits is : " + sum);
        sc.close();
    }  
}