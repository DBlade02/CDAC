package multithreading;
public class Customer {
	private double balance;
	public Customer(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public synchronized  void withdraw(double amt) {
		System.out.println("Going to withdraw");
		System.out.println("Balance: "+getBalance());
		if(amt > balance) {
			System.out.println("Wiating for deposit!");
	      try {
			wait(); // ITC
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		balance = balance - amt;
		System.out.println("Withdraw success...updated Balance: "+balance);	
	}
	
	public synchronized void deposit(double amt) {
		System.out.println("Going to deposit");
		balance = balance+amt;
		System.out.println("Deposit Success!");
		System.out.println("Updated balance: "+getBalance());
		notify();
	}
	
	
}
