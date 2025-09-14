//21. Write a program to print the factorial of numbers from 1 to 10.
public class Factorial10 {
    public static void main(String[] args) {
        for (int num = 1; num <= 10; num++) {
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + num + " is : " + fact);
        }
    }
}
