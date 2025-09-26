package multithreading;

public class Display {
	
	public synchronized void dispUpper() {
		for(int i=65;i<=90;i++) {
			System.out.print((char)i+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void dispLower() {
		for(int i=97;i<=122;i++) {
			System.out.print((char)i+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public  synchronized void dispNumbers() {
		for(int i=48;i<=57;i++) {
			System.out.print((char)i+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
