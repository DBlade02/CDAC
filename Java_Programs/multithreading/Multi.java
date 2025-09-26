package multithreading;
public class Multi extends Thread {
	@Override
	public void run() {
	for(int i=1; i<=25;i=i+2) {
		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
	public static void main(String[] args) throws InterruptedException {
		Multi t1 = new Multi();
		t1.start();
		
		t1.join(5000); // indefinite or time bound
		
		Multi t2 = new Multi();
		t2.start();
		
		Multi t3 = new Multi();
		t3.start();
		
		
	}

}
