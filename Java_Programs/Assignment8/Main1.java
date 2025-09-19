abstract class Shape{
    abstract void area();
}

class Rectangle extends Shape{
    void area(){
        System.out.println("Area of Rectangle");
    }  
}

class Circle extends Shape{
    void area(){
        System.out.println("Area of Circle");
    }
}

class Main1 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();

        Circle c = new Circle();
        c.area();   
    }
    
}
