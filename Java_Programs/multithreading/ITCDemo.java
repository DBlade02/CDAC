package multithreading;
public class ITCDemo {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(25000);
		
		new Thread() {
			public void run() {
				c1.withdraw(30000); // 
			}
		}.start();
		
		new Thread() {
			public void run() {
				c1.deposit(15000); // 
			}
		}.start();
		
		

	}

}
