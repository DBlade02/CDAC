//Determine the volume of a sphere given its radius using the formula: V = (4/3) * π * r^3.
import java.util.Scanner;
public class Volume_Spear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the radius of the sphere: ");
            double radius = sc.nextDouble();
            final double PI = 3.14159;
            double volume = (4.0/3.0) * PI * Math.pow(radius,3);
            System.out.println("The volume of the sphere with radius " + radius + " is: " + volume);
        }
    }
}
