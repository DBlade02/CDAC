//Calculate the compound interest on an investment using the formula: A = P * (1 + r/n)^(n*t).

package Java_Programs;
import java.util.Scanner;
public class Compound_Intrest {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the P : "); //Principal
            double P = sc.nextDouble();

            System.out.print("Enter the r : "); //Rate
            Double r = sc.nextDouble();

            System.out.print("Enter the t : "); //Time
            int t = sc.nextInt();

            System.out.print("Enter the n : ");
            int n = sc.nextInt();

            //Formula for compound interest of Investment
            double A = P * Math.pow((1 +r/(n*100)), n*t);
            System.out.println("The Compound Interest is: " + A);
            sc.close();
        }
        
}
