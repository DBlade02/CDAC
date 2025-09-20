/*Problem 1: Create an abstract class Shape with an abstract method double area().
Then, create two subclasses, Circle and Rectangle, that extend Shape and provide
implementations for the area method. Write a main method to create instances of Circle
and Rectangle, and display their areas. */
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
