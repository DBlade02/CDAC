package multithreading;

public class RunnableDemo  implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<=25;i=i+2)
			System.out.println(i);
		}
	
	public static void main(String[] args) {
		Runnable r1 = new RunnableDemo();
		Runnable r2 = new RunnableDemo();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
	}

