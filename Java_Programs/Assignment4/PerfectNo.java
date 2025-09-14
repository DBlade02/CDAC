//26. Write a program to check if a given number is a perfect number.
import java.util.Scanner;
public class PerfectNo {
    public static void main(String[] args) {
        System.out.println("Enter number to check perfect number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int sum = 0;
        for(int i=1 ; i<=num/2 ; i++){
            if(num%i==0){
                sum = sum + i;
            }
        }
        if(sum == num){
            System.out.println(num + " is a Perfect Number.");
        }
        else{
            System.out.println(num + " is not a Perfect Number.");
        }
        sc.close();
    }
}
