/*Problem 4: Number Format Exception
Task: 
Write a program that takes a string input from the user and tries to convert it to an integer. 
Use a try block to perform the conversion and a catch block to handle the NumberFormatException. 
Ensure a finally block prints a message indicating the operation is complete.*/
package Exception_handling;
import java.util.Scanner;
public class NumFormatException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		sc.close();
		try 
		{
			int num1 = Integer.parseInt(str);
			System.out.println("Number: "+num1);
		} 
		catch(NumberFormatException e) 
		{
			System.out.println("Invalid input");
		}
		finally 
		{
			System.out.println("Operation complete");
		}
		sc.close();
	}
}
