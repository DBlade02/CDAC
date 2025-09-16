//Program to read and print array elements
import java.util.Scanner;
public class ArrReadPrint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integer elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("\nArray elements are:");
        System.out.print("Using for loop: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.print("Using enhanced for loop: ");
        scanner.close();
    }
}