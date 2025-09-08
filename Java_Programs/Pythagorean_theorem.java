// Compute the hypotenuse of a right triangle using the Pythagorean theorem: c = sqrt(a^2 + b^2).
package Java_Programs;
public class Pythagorean_theorem {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 4.0;
        double c = Math.sqrt(a * a + b * b);
        System.out.println("The length of the hypotenuse is: " + c);
    }
}