// /5. Write a program to check if a given number is prime.

import java.util.Scanner;
public class PrimeNo {

    public static void main(String[] args) {
        System.out.print("Enter number to check prime or not : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        boolean Prime = true;
        for (int i=2; i<num; i++){
            if(num% i ==0){
                Prime = false;
                System.out.println(num + " is not a prime number.");
                break;
            }
            else{
                Prime = true;
                System.out.println(num + " is a prime number.");
                break;
            }
        }
        scanner.close();
    }  
}
