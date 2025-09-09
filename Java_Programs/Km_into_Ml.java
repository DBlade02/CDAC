// Convert a distance from kilometers to miles using the formula: miles = kilometers * 0.621371.


import java.util.Scanner;
public class Km_into_Ml {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in) // create a Scanner to take input
        ) {
            System.out.print("Enter Distance in kilometers: ");
            double Kl = sc.nextDouble(); // store the input in a variable
            if (Kl < 0) {
                System.out.println("Distance cannot be negative");
            } else {
                double Ml = Kl * 0.621371;
                System.out.println(Kl + " kilometers is equal to " + Ml + " miles.");
            }
            sc.close(); // close the scanner to prevent resource leaks
        }
    }
}
