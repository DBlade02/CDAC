// 8. Write a program to check if a given number is a palindrome.
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter number to check its palandrome or not : ");
        Scanner scaner = new Scanner(System.in);
        int num = scaner.nextInt();
        scaner.close();
        int originalNum = num;
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number is : " + reversedNum);
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
    
}
