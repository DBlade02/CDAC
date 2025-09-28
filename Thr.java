
class A extends Thread {

    @SuppressWarnings("override")
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        
    }
}

class B extends Thread {

    @SuppressWarnings("override")
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("World");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Thr {
    public static void main(String[] args){
        
        A a = new A();
        B b = new B();
        a.start();
        try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        b.start();
    }
}