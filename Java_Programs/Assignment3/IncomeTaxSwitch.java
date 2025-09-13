/*3. Income Tax Calculation
Problem Statement:
Write a program that calculates the income tax payable based on the annual salary:
Income ≤ ₹2,50,000 → No tax
₹2,50,001 to ₹5,00,000 → 5% tax
₹5,00,001 to ₹10,00,000 → 20% tax
Above ₹10,00,000 → 30% tax*/
import java.util.Scanner;

public class IncomeTaxSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Salary:");
        int salary = scanner.nextInt();

        int a = 0;
        if (salary <= 250000) {
            a = 0; 
        }else if (salary >= 250001 && salary <= 500000) {
            a = 1; 
        }else if (salary >= 500001 && salary <= 1000000) {
            a = 2; 
        }else if (salary > 1000000) {
            a = 3; 
        }

        if (salary >= 0) {

            int tax;
            switch (a) {
                case 0:
                    System.out.println("No Tax Applicable   Salary is :" + salary);
                    break;
                case 1:
                    tax = (salary * 5) / 100;
                    System.out.println("Tax Payable is :" + tax);
                    break;
                case 2:
                    tax = (250000 * 5) / 100 + (((salary - 500000) * (20)) / 100);
                    System.out.println("Tax Payable is :" + tax);
                    break;
                case 3:
                    tax = (250000 * 5) / 100 + (500000 * 20) / 100 + (((salary - 1000000) * 30) / 100);
                    System.out.println("Tax Payable is :" + tax);
                    break;

            }
        } else {

            System.out.println("Input should be positive only");

        }
    }
}
