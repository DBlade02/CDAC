// 9. Write a program to find the sum of all odd numbers between 1 and 50
import java.util.Scanner;
public class OddNumSum {
    public static void main(String[] args) {
        System.out.println("Enter the number upto which you want to find the sum of odd numbers : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int sum = 0;
        for(int i=1; i<=number; i++){
            if(i%2 !=0){
                sum = sum+i;
                System.err.print(i + " ");
            }
        }
        System.out.println("Sum of odd numbers between 1 and " + number + " is : " + sum);
        scanner.close();
    }
}
