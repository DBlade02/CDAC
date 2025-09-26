package multithreading;

public class MyThread3 extends Thread{
	// 19
	Table t;

	public MyThread3(Table t) {
		this.t = t;
	}
	
	public void run() {
		t.printTable(19);
	}
	
}