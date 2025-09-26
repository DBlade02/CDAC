package multithreading;

public class MultiDemo extends Thread {
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getId());
	}

	public static void main(String[] args) {
		
		MultiDemo t1 = new MultiDemo();
		t1.setName("first");
		MultiDemo t2 = new MultiDemo();
		t2.setPriority(MAX_PRIORITY);
		MultiDemo t3 = new MultiDemo();
		t3.setName("third");
		t1.setDaemon(true);
		t1.start(); 
		t2.start();
		t3.start();
		System.out.println(t1.isDaemon()); // true
		
	}

}
