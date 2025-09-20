public class Main3 {
    public static void main(String[] args) {
        Appliance washingMachine = new WashingMachine("Samsung", 2000);
        washingMachine.turnOn();

        System.out.println();
        
        Appliance refrigerator = new Refrigerator("LG", 500);
        refrigerator.turnOn();
        
        System.out.println();
        
        Appliance microwave = new Microwave("Panasonic", 1000);
        microwave.turnOn();

    }
}