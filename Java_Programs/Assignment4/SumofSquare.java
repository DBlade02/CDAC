//23. Write a program to calculate the sum of the squares of numbers from 1 to 10.
public class SumofSquare {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i * i; // Adding the square of the current number to sum
            System.out.println(sum);
        }
        System.out.println("The sum of the squares of numbers from 1 to 10 is: " + sum);
    }
    
}
