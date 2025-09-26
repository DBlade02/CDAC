package abstraction;

public class Bank implements ATM, TTP{
	@Override
	public void withdraw() {
		System.out.println("Withdraw success");
	}
	@Override
	public void deposit() {
		System.out.println("Deposit success! and you won "+cashback);
	}

	@Override
	public void transfer() {
		System.out.println("Transferred!");
	}
	
	@Override
	public void confirmTransaction() {
		System.out.println("Transaction Confirmed!");
	}
	
	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.deposit();
		b.transfer();
		b.withdraw();
		b.confirmTransaction();
		
		
	}
	
	

}
