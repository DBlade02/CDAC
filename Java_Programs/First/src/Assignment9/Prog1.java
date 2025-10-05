package Assignment9;

/*Problem 1: Basic Package Creation and Usage 
Task: Create a package named com.example.math and add a class Calculator 
with methods for addition  
and subtraction. Then, create another class MathTest in the com.example.test 
package to use the  
Calculator class*/

class Calculator{

    public void addition(int a, int b) {
        System.out.println("Addition is :" + (a + b));
    }

    public void subtraction(int a, int b) {
        System.out.println("Subtraction is :" + (a - b));
    }
}
//------------------------------------------------------------------------------------------------------------------------ 

public class Prog1 {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.addition(5, 10);
        c.subtraction(10, 5);
    }
}
