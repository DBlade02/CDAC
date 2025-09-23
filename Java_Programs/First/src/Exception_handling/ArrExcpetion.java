/*Problem 2: Array Index Out of Bounds
Task: Write a program that initializes an array of integers and tries to access an index that is out of bounds. 
Use a try block to access the array and a catch block to handle the ArrayIndexOutOfBoundsException. 
Ensure a finally block prints a message indicating the operation is complete
 */
package Exception_handling;
public class ArrExcpetion {
	public static void main(String[] args) {
		try{ int arr[] = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[5] = 50;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds");
		}
		finally {
			System.out.println("Finally block");
		}
		
	}

}
