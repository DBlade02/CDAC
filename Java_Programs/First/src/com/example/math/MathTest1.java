package com.example.math;

import com.example.math.Calculator;

public class MathTest1 {
    public static void main(String[] args) {
        var calculator = new Calculator();
        int sum = calculator.add(2, 3);
        int difference = calculator.subtract(5, 2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}