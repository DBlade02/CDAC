package com.company;
import com.company.Hr.Employee;
import com.company.account.Account;

public class CompanyTest {
    public static void main(String[] args) {
        // Create an Account object
        Account acc = new Account("AC12345", 50000.0);
        acc.displayAccountDetails();

        System.out.println();

        // Create an Employee object
        Employee emp = new Employee("Aditya Mogre", "Software Engineer");
        emp.displayEmployeeDetails();
    }
}
