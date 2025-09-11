//Problem 2: Simple Calculator
//Task: Write a program that takes two integers and an operator (+, -, *, /) as input and performs the corresponding operation. Use a switch statement to handle the operations.

import java.util.Scanner;
public class SImple_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        double var1 = sc.nextDouble();
        System.out.print("Enter Second Number: ");
        double var2 = sc.nextDouble();
        System.out.print("Enter the operation (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        sc.close();
        double result;
        switch(operator){
            case '+':
                result = var1 + var2;
                System.out.println("The sum is: " + result);
                break;
            case '-':
                result = var1 - var2;
                System.out.println("The difference is: " + result);
                break;
            case '*':
                result = var1 * var2;
                System.out.println("The product is: " + result);
                break;
            case '/':
                if(var2 != 0){
                    result = var1 / var2;
                    System.out.println("The quotient is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                break;
        }
    }
}
