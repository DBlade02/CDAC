/*Using this in Constructors: Create a class Rectangle with attributes length and width.
Implement a parameterized constructor that initializes these attributes. Use this to differentiate
between class variables and constructor parameters. Include methods to calculate the area and
perimeter.*/
class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return this.length * this.width;
    }

    public double perimeter() {
        return 2 * (this.length + this.width);
    }


    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
    }
}

   

