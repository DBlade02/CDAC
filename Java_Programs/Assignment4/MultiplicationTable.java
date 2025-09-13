// 3. Write a program to print the multiplication table of a given number.
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter number you want Table : ");
        int num = new java.util.Scanner(System.in).nextInt();
        System.out.println("Multiplication table of " + num + " is: ");
        for (int i =1 ; i<=10 ; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
