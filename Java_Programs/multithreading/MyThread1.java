package multithreading;

public class MyThread1 extends Thread{
	// 17
	Table t;

	public MyThread1(Table t) {
		this.t = t;
	}
	
	public void run() {
		t.printTable(17);
	}
	
}
