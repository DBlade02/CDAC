// Determine whether a number is positive, negative, or zero.

import java.util.Scanner;
public class Positive_Negative {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            Float number = sc.nextFloat();
            if(number>0){
                System.out.println("The number is positive.");
            }
            else if(number==0)
            {
                System.out.println("The number is zero.");
            }
            else
            {
                System.out.println("The number is negative.");
            }
        }
        catch (Exception e)
        {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
