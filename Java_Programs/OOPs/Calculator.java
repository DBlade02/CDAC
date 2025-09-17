/*Class and methods: Create a class Calculator with relevant data members and a
constructor. Implement methods for basic arithmetic operations (addition, subtraction,
multiplication, division, modulus) and demonstrate their usage.*/

public class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return this.num1 + this.num2;
    }

    public double subtract() {
        return this.num1 - this.num2;
    }

    public double multiply() {
        return this.num1 * this.num2;
    }

    public double divide() {
        if (this.num2 != 0) {
            return this.num1 / this.num2;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }

    public double modulus() {
        return this.num1 % this.num2;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(100, 25);
        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
        System.out.println("Division: " + calc.divide());
        System.out.println("Modulus: " + calc.modulus());
    }
}
