import java.util.Scanner;

public class Mi_Km{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Distance in Miles: ");
            double millas = scanner.nextDouble();
            double kilometros = millas * 1.60934;
            System.out.printf("Distance in Kilometers: %2f ",kilometros);
            scanner.close();
        }
    }
}