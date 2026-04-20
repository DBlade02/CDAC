import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }

    static boolean isArmstrong(int n) {
        int originalNumber = n;
        int result = 0;

        while (n > 0) {
            int rem = n % 10;
            // Add the cube of the digit to the result
            result += (rem * rem * rem);
            n = n / 10;
        }

        // Check if the sum of cubes matches the original number
        return result == originalNumber;
    }
}