/*2. Electricity Bill Calculation
Problem Statement:
Write a program that calculates the electricity bill based on the number of units consumed. The
charges per unit are:
Up to 100 units: ₹5 per unit
101 to 200 units: ₹6 per unit
201 to 300 units: ₹7 per unit
Above 300 units: ₹8 per unit*/

import java.util.Scanner;
public class Electricity_Bill {
    public static void main(String[] args) 
    {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of units consumed: ");
    int units = scanner.nextInt();
    scanner.close();    
        if(units<0)
        {
            System.out.println("Invalid Input");
            return;
        } 
        int billAmount;
        if (units <= 100) {
            billAmount = units * 5;
        } else if (units <= 200) {
            billAmount = (100 * 5) + ((units - 100) * 6);
        } else if (units <= 300) {
            billAmount = (100 * 5) + (100 * 6) + ((units - 200) * 7);
        } else {
            billAmount = (100 * 5) + (100 * 6) + (100 * 7) + ((units - 300) * 8);
        }
        System.out.println("The total electricity bill is: RS" + billAmount);
    scanner.close();
    }
}