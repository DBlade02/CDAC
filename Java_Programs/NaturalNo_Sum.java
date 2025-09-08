// Calculate the sum of the first n natural numbers using the formula: sum = (n * (n + 1)) / 2.
package Java_Programs;
import java.util.Scanner;
public class NaturalNo_Sum 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");// Take input from the user
        long n = sc.nextLong();
        if(n<0)
        {
            System.out.println("Please enter a positive integer.");// Handle negative input
        }
        else
        {
            long sum = n * (n + 1) / 2; // Using the formula to calculate the sum
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
        sc.close(); // Close the scanner to prevent resource leaks
    }  
}
