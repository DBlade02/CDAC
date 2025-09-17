/* Static Method: 
Add a static method to the BankAccount class from the previous problem
to calculate interest based on a given balance and interest rate. 
Also, implement a method to display the account details including balance and interest earned. */
public class BankAcc2 {

    private int accNo;
    private String accType;
    private double balance;
    private static double interestRate;

    public BankAcc2(int accNo, String accType, double balance, double interestRate) {
        this.accNo = accNo;
        this.accType = accType;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public static double calculateInterest(double balance) {
        return balance * interestRate / 100;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
        System.out.println("New Balance: " + balance);
        System.out.println("-------------------------------");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance. Withdrawal failed.");
        }
        System.out.println("New Balance: " + balance);
        System.out.println("-------------------------------");
    }

    public void displayDetails() {
        System.out.println("Account No: " + accNo);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        BankAcc2 b1 = new BankAcc2(1, "Savings", 10000, 5.0);
        b1.displayDetails();

        b1.deposit(500);
        b1.displayDetails();

        b1.withdraw(200);
        b1.displayDetails();

        System.out.println("");

        BankAcc2 b2 = new BankAcc2(2, "Current", 20000, 5.0);
        b2.displayDetails();

        b2.deposit(5000);
        b2.displayDetails();

        b2.withdraw(1000);
        b2.displayDetails();

        System.out.println("");

        double interest1 = BankAcc2.calculateInterest(b1.balance);
        System.out.println("Interest earned on account 1: " + interest1);
    }
}
