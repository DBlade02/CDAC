class Main9 {

    void createShape() {
        Shape s1 = new Shape() {
            @Override
            public void draw() {
                System.out.println("A Shape is Drawn");
            }
        };
        s1.draw();
    }

    public static void main(String[] args) {
        Main9 s = new Main9();
        s.createShape();
    }

    interface Shape {
        void draw();
    }
}