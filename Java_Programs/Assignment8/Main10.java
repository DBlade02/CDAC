
class Printer {

    void printMessage() {
        System.out.println("Before Overriding----This is printMessage() method of Printer Class");
    }
}

public class Main10 {

    void createPrinter() {

        Printer p = new Printer() {

            @Override
            void printMessage() {
                System.out.println("After Overriding----This is printMessage() method of Printer2 Class");
            }

        };
        p.printMessage();

    }

    public static void main(String[] args) {

        Main10 p2 = new Main10();
        p2.createPrinter();
    }
}
