// 12. Write a program to reverse a given number.
import java.util.Scanner;
public class ReverseNo {
    public static void main(String[] args) {
        System.out.println("Enter number to reverse : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        int reversedNum = 0;
        while(num !=0){
            int digit = num %10;
            reversedNum = reversedNum *10 + digit;
            num /=10;
        }
        System.out.println("Reversed Number is : " + reversedNum);
        scanner.close();
    }
    
}
