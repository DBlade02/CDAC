package Java_Programs;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create a Scanner object to take input
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // create a String variable to store the name
        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // create an int variable to store the age
        System.out.println("Hello " + name + ", you are " + age + " years old.");
        sc.close(); // close the scanner to prevent resource leaks
    }
}