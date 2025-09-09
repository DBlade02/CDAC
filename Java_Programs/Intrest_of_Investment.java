//Calculate the simple interest on an investment using the formula: A = P * T * R / 100;
import java.util.Scanner;
public class Intrest_of_Investment {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the P : "); //Principal
            double principal = sc.nextDouble();
            
            System.out.print("Enter the r : "); //Rate
            Double rate = sc.nextDouble();
            
            System.out.print("Enter the t : "); //Time
            int time = sc.nextInt();
            double Intrest_of_Investment =(principal*rate*time)/100;
            System.out.println("The Intrest_of_Investment is: " + Intrest_of_Investment);
        } //Principal
    }
}
