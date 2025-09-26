package multithreading;

public class Driver {

	public static void main(String[] args) {
		Display d = new Display();
		
		Thread t1 = new Thread() {
			public void run() {
				d.dispUpper();
			}
		};
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				d.dispLower();
			}
		};
		t2.start();
		
		Thread t3 = new Thread() {
			public void run() {
				d.dispNumbers();
			}
		};
		t3.start();

	}

}
