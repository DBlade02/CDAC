//13. Write a program to calculate the power of a number using a loop.
import java.util.Scanner;
public class PowerofNum {
  public static void main(String[] args) {
    System.out.println("Enter the base number : ");
    Scanner scanner = new Scanner(System.in);
    int base = scanner.nextInt();
    if (base == 0) {
      System.out.println("Any number raised to the power of 0 is 1.");
      return;
    }
    System.out.println("Enter the exponent number : ");
    int exponent = scanner.nextInt();
    if (exponent < 0) {
      System.out.println("Exponent should be a non-negative integer.");
      return;
    }
    scanner.close();
    int result = 1;
    for (int i = 1; i <= exponent; i++) {
      result = result * base;
    }
    System.out.println(base + " raised to the power of " + exponent + " is : " + result);
    scanner.close();
  }  
}
