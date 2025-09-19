/*Create class Box and Box3d. Box3d is extended class of Box.
The above two classes going to fulfill the following requirement. 
Include constructor, set value of length, breadth, height. 
Find out area and volume. */

public class Box {
    protected double length;
    protected double breadth;

    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void setDimensions(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }
}