public class Box3D extends Box {
    private double height;

    public Box3D(double length, double breadth, double height) {
        super(length, breadth);  
        this.height = height;
    }

    public void setDimensions(double length, double breadth, double height) {
        super.setDimensions(length, breadth);
        this.height = height;
    }

    public double getSurfaceArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    public double getVolume() {
        return length * breadth * height;
    }
}
