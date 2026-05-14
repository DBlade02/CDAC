/*Problem 4: Number Format Exception
Task: Write a program that takes a string input from the user and tries to convert it to an integer. 
Use a try block to perform the conversion and a catch block to handle the NumberFormatException. 
Ensure a finally block prints a message indicating the operation is complete.

Problem: Nested Try Blocks with Multiple Exceptions
Task: Write a program that demonstrates the use of nested try blocks. The program should perform the following tasks:
try should have two separate try blocks.
In the first nested try:
Divide two integers, handling any potential ArithmeticException.

Within the second try block, initialize an array and attempt to access an out-of-bounds index, handling the ArrayIndexOutOfBoundsException.
Ensure that appropriate messages are printed for each exception, and that a final message is printed indicating the completion of the operation.*/

package Exception_handling;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String input = sc.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            System.out.println("Operation complete.");
        }

        try {
            try {
                int a = 10, b = 0;
                int result = a / b;
                System.out.println("Division result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }

            try {
                int[] arr = {1, 2, 3};
                System.out.println("Accessing index 5: " + arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Array index out of bounds.");
            }
        } finally {
            System.out.println("Operation complete.");
        }

        sc.close();
    }
}
