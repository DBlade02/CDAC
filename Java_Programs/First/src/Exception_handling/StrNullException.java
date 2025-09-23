/*Problem 3: Null Pointer Exception
Task: Write a program that initializes a string variable to null and then tries to call a method on it. 
Use a try block to call the method and a catch block to handle the NullPointerException. 
Ensure a finally block prints a message indicating the operation is complete */
package Exception_handling;

public class StrNullException {
	public static void main(String[] args) {
		String str = null;
		try {
			System.out.println(str.length());
		} 
		catch (NullPointerException e) {
		}
		finally {
			System.out.println("Operation complete");
		}	
		
	}
}
