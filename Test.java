class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 300; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try { Thread.sleep(10); } catch (InterruptedException e) {}
        }
    }
}

public class Test {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start(); 
        t2.start();
        t3.start();

        t1.join(); // wait for t1
        t2.join(); // wait for t2
        t3.join(); // wait for t3

        System.out.println("Main thread finished!");
    }
}
