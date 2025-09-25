package Assignment_11;

class NegativeBalanceException extends Exception {
 public NegativeBalanceException(String message) {
     super(message);
 }
}

class Account {
 private String accountType;
 private String accountNumber;
 private double balance;
 private final double minBalance;

 public Account(String accountType, String accountNumber, double balance, double minBalance) {
     this.accountType = accountType;
     this.accountNumber = accountNumber;
     this.balance = balance;
     this.minBalance = minBalance;
 }

 public double calculateInterest(int time, double rate) throws NegativeBalanceException {
     if (balance < 0) {
         throw new NegativeBalanceException("Negative balance! Cannot calculate interest.");
     }
     return (balance * rate * time) / 100;
 }

 public void displayAccountDetails() {
     System.out.println("Account Type   : " + accountType);
     System.out.println("Account Number : " + accountNumber);
     System.out.println("Balance        : " + balance);
     System.out.println("Min-Balance    : " + minBalance);
 }

 public double getBalance() {
     return balance;
 }
}

class Customer {
 private String name;
 private String address;
 private String id;
 private String phone;
 private Account account; 

 public Customer(String name, String address, String id, String phone, Account account) {
     this.name = name;
     this.address = address;
     this.id = id;
     this.phone = phone;
     this.account = account;
 }

 public void disp() {
     System.out.println("Customer Details");
     System.out.println("Name    : " + name);
     System.out.println("Address : " + address);
     System.out.println("ID      : " + id);
     System.out.println("Phone   : " + phone);
     System.out.println("\nAccount Details");
     account.displayAccountDetails();
 }
}


public class Program_1 {
 public static void main(String[] args) {
     try {
         Account acc = new Account("Savings", "AC12345", 5000, 500);

         Customer cust = new Customer("Aditya Mogre", "Nagpur", "C101", "9876543210", acc);

         cust.disp();

         System.out.println("\nInterest Calculation");
         double interest = acc.calculateInterest(2, 5); 
         System.out.println("Simple Interest : " + interest);

     } catch (NegativeBalanceException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}
