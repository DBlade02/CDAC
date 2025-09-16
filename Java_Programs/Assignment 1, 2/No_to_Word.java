/*Problem 4: Number to Word Conversion
Task: Write a program that takes an integer input (0-5) from the user and prints the
corresponding word (e.g., 0 -> "Zero", 1 -> "One"). Use a switch statement to handle the conversion.*/

import java.util.Scanner;
public class No_to_Word{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		sc.close();
		switch(number){
		case 0:
			System.out.print("Zero");
			break;
		case 1:
			System.out.print("One");
			break;
		case 2:
			System.out.print("Two");
			break;
		case 3:
			System.out.print("Three");
			break;
		case 4:
			System.out.print("Four");
			break;
		case 5:
			System.out.print("Five");
			break;
		default:
			System.out.print("Error: Input out of Number");
		}
	}
}