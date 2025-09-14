// 31. Write a program to find the sum of all prime numbers between 1 and 100.
public class SumofPrimeNo {
    public static void main(String[] args) {
        int sum = 0;
        for (int num = 2; num <= 100; num++) {
            if (isPrime(num)) {
                sum += num;
            }
        }
        System.out.println("The sum of all prime numbers between 1 and 100 is: " + sum);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
}
