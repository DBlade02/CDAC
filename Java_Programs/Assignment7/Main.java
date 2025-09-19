public class Main {
    public static void main(String[] args) {
        
        Box rectangle = new Box(5, 3);
        System.out.println("Area of Rectangle (Box): " + rectangle.getArea());

        Box3D box3d = new Box3D(5, 3, 2);
        System.out.println("Surface Area of Box3d: " + box3d.getSurfaceArea());
        System.out.println("Volume of Box3d: " + box3d.getVolume());

        box3d.setDimensions(7, 4, 3);
        System.out.println("Updated Surface Area of Box3d: " + box3d.getSurfaceArea());
        System.out.println("Updated Volume of Box3d: " + box3d.getVolume());
    }
}
