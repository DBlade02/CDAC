class A implements Runnable{
    public void run(){
        for(int i=1;i<100;i++){
        System.out.println("Hello");
        try{
            Thread.sleep(10);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=1;i<100;i++){
        System.out.println("World");
        try{
            Thread.sleep(10);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    }
}


public class Runable {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        try{
            Thread.sleep(2);
        }catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
    
}
