// 10. Write a program to find the sum of all even numbers between 1 and 50
import java.util.Scanner;
public class EvenNoSum {
    public static void main(String[] args) {
        System.out.println("Enter the number upto which you want to find the sum of Even numbers : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        int sum = 0;
        for(int i=1; i<=number; i++){
            if(i%2 ==0){
                sum = sum+i;
                System.err.print(i + " ");
            }
        }
        System.out.println("Sum of Even numbers between 1 and " + number + " is : " + sum);
        scanner.close();
    } 
}
