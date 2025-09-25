/*Problem5: 
Nested Try Blocks with Multiple Exceptions:
Task: Write a program that demonstrates the use of nested try blocks. 
The program should perform the following tasks: try should have two separate try blocks.
In the first nested try: Divide two integers, handling any potential ArithmeticException.
Within the second try block, initialize an array and attempt to access an out-of-bounds index, handling the ArrayIndexOutOfBoundsException.
Ensure that appropriate messages are printed for each exception, and that a final message is printed indicating the completion of the operation. */

package Exception_handling;

public class NestedTryCatch {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int result;
        try {
            try {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } 
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }
            try {
                int arr[] = new int[4];
                arr[0] = 10;
                arr[1] = 20;
                arr[2] = 30;
                arr[3] = 40;
                arr[5] = 50;
                System.out.println(arr[5]);

            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds");
            }
        } 
		catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
		finally {
            System.out.println("Operation complete");
        }
    }
}
