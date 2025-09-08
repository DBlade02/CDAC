//Calculate the compound interest on an investment using the formula: A = P * (1 + r/n)^(n*t).

package Java_Programs;

public class Compound_Intrest {
        public static void main(String[] args) {
            double P = 5000.0;
            int r = 5;
            int t = 3;
            int n = 4;
            double A = P * Math.pow((1 + (double)r/(n*100)), n*t);
            System.out.println("The Compound Interest is: " + A);
        }
}
