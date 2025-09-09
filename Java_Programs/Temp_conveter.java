//Convert a temperature from Celsius to Fahrenheit using the formula: F = (C * 9/5) + 32.
package Java_Programs;
import java.util.Scanner;
public class Temp_conveter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Celsius: ");
            double celsius = sc.nextDouble(); // input Celsius temperature
            double fahrenheit = (celsius * 9/5) + 32; // Converting into fahrenheit
            System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
        }
        
    }
}