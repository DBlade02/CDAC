import java.util.Scanner;
public class LargestofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        System.out.print("Enter First number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second number : ");
        int b = sc.nextInt();   
        System.out.print("Enter Third number : ");
        int c = sc.nextInt();
        sc.close();
        if (a >= b && a >= c) 
        {
            System.out.print("The largest number is: " + a);
        }
        else if (b >= a && b >= c) 
        {
            System.out.print("The largest number is: " + b);
        } 
        else 
        {
            System.out.print("The largest number is: " + c);
        }
    }   
}
