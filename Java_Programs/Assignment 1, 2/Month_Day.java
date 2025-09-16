/*Problem 5: Month Days
Task: Write a program that takes an integer input (1-12) representing a month and prints the
number of days in that month. Assume it's not a leap year.*/

import java.util.Scanner;
public class Month_Day{
	public static void main(String[] args) {
            Integer month;
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter the Month_Day 1-12 : ");
                month = sc.nextInt();
            }
		switch(month){
		case 1:
			System.out.println("Its January 2025 ");
			System.out.print("Its have 31 days ");
			break;
		case 2:
			System.out.println("Its February 2025 ");
			System.out.print("Its have 28 days ");
			break;
		case 3:
			System.out.println("Its March 2025 ");
			System.out.print("Its have 31 days ");
			break;
		case 4:
			System.out.println("Its April 2025 ");
			System.out.print("Its have 30 days ");
			break;
		case 5:
			System.out.println("Its May 2025 ");
			System.out.print("Its have 31 days ");
			break;
		case 6:
			System.out.println("Its June 2025 ");
			System.out.print("Its have 30 days ");
			break;
		case 7:
			System.out.println("Its July 2025 ");
			System.out.print("Its have 31 days ");
			break;
		case 8:
			System.out.println("Its August 2025 ");
			System.out.print("Its have 31 days ");
			break;
		case 9:
			System.out.println("Its September 2025 ");
			System.out.print("Its have 30 days ");
			break;
		case 10:
			System.out.println("Its October 2025 ");
			System.out.print("Its have 31 days ");
			break;
		case 11:
			System.out.println("Its November 2025 ");
			System.out.print("Its have 30 days ");
			break;
		case 12:
			System.out.println("Its December 2025 ");
			System.out.print("Its have 31 days ");
			break;
		default:
			System.out.print("Error : Wrong Input");
			break;
		}
	}
}