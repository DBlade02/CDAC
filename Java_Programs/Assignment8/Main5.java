/*Create an interface Vehicle with a default method startEngine() that prints "Engine started". 
Implement this interface in the class Car and override the startEngine() method */
interface VehicleInterface {

    default void startEngine() {
        System.out.println("Engine Started");
    }
}

class Car implements VehicleInterface {

    @Override
    public void startEngine() {
        System.out.println("Car is running at 100 KMPH \n (Default startEgine method in VehicleInterface is overriden)");
    }
}

public class Main5 {
    public static void main(String[] args) {
        VehicleInterface c = new Car();
        c.startEngine();
    }
}
