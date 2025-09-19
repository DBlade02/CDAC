/*Static Variable: Create a class BankAccount with accno, accType, Balance and static
variable interestRate. Initialize it using a static block. Implement methods to deposit and
withdraw funds. Create objects and display details.*/

public class BankAcc {

    private int accNo;
    private String accType;
    private double balance;               // Make balance instance-specific
    private static double interestRate;  // Shared across all accounts

    static {
        interestRate = 5.5;
        System.out.println("Static block executed: Interest Rate set to " + interestRate + "%");
        System.out.println("-------------------------------");
    }

    public BankAcc(int accNo, String accType, double balance) {
        this.accNo = accNo;
        this.accType = accType;
        this.balance = balance;
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
        BankAcc b1 = new BankAcc(1, "Savings", 10000);
        b1.displayDetails();

        b1.deposit(500);
        b1.displayDetails();

        b1.withdraw(200);
        b1.displayDetails();

        System.out.println("");

        BankAcc b2 = new BankAcc(2, "Current", 20000);
        b2.displayDetails();

        b2.deposit(5000);
        b2.displayDetails();

        b2.withdraw(1000);
        b2.displayDetails();

        System.out.println("");
    }
}