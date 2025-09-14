//20. Write a program to print the sum of first 50 natural numbers.
public class NaturalnoADD {
    public static void main(String[] args) {
        int sum =0;
        for(int i=0;i<=50;i++){
            sum = sum + i;
        }
        System.out.println("The sum of first 50 natural numbers is: " + sum);
    }
}
