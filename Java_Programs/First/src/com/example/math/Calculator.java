/*Basic Package Creation and Usage
Task: Create a package named com.example.math and add a class Calculator with methods for addition and subtraction. 
Then, create another class MathTest in the com.example.test package to use the Calculator class
*/

package com.example.math;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}