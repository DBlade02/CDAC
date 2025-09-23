package com.example.shapes;

import com.example.utils.MathUtils;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Double area() {
        return MathUtils.Pi() * radius * radius;
    }

    public void display() {
        System.out.println("Area of circle: " + area());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(8.0);
        circle.display();
    }
}   
