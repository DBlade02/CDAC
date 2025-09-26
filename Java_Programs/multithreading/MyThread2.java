package multithreading;

public class MyThread2 extends Thread{
	// 18
	Table t;

	public MyThread2(Table t) {
		this.t = t;
	}
	
	public void run() {
		t.printTable(18);
	}
	
}