/*Problem 1: Division by Zero
Task: Write a program that takes two integers from the user and performs division. 
Use a try block to perform the division, and a catch block to handle the ArithmeticException in case of division by zero. 
Ensure that a finally block prints a message indicating that the operation is complete.
 */

package Exception_handling;
import java.util.Scanner;
public class DivisionByZero {

	public static void main(String[] args) {
		try{ Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter numerator: ");
			double num1 = sc.nextDouble();
			System.out.println("Enter denominator: ");
			double num2 = sc.nextDouble();
			System.out.println("Result: "+num1/num2);
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by zero");
		}
		finally{
			System.out.println("Operation complete");
		}
	}
}
