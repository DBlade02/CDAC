/*Create an abstract class Appliance with fields for brand and power
consumption, and an abstract method void turnOn(). Create three subclasses,
WashingMachine, Refrigerator, and Microwave, each providing their own
implementation of the turnOn method. Write a main method to create instances of
WashingMachine, Refrigerator, and Microwave, and invoke the turnOn method on each
instance to display brand and power consumed. */

abstract class Appliance {
    protected String brand;
    protected int powerConsumption;

    public Appliance(String brand, int powerConsumption) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
    }

    abstract void turnOn();
}

class WashingMachine extends Appliance {
    public WashingMachine(String brand, int powerConsumption) {
        super(brand, powerConsumption);
    }

    @Override
    public void turnOn() {
        System.out.println("Brand: " + brand);
        System.out.println("Power Consumption: " + powerConsumption);
        System.out.println("Washing Machine turned on.");
    }
}

class Refrigerator extends Appliance {
    public Refrigerator(String brand, int powerConsumption) {
        super(brand, powerConsumption);
    }

    @Override
    public void turnOn() {
        System.out.println("Brand: " + brand);
        System.out.println("Power Consumption: " + powerConsumption);
        System.out.println("Refrigerator turned on.");
    }
}

class Microwave extends Appliance {
    public Microwave(String brand, int powerConsumption) {
        super(brand, powerConsumption);
    }

    @Override
    public void turnOn() {
        System.out.println("Brand: " + brand);
        System.out.println("Power Consumption: " + powerConsumption);
        System.out.println("Microwave turned on.");
    }
}

