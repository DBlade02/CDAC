/*Problem 6: Interface Inheritance - Create an interface Shape with methods draw() and
calculateArea(). Create another interface Colorful that extends Shape and adds a
method fillColor(). Implement these interfaces in the class Circle. */

interface ShapeInterface {
	void draw();
	void calculateArea(int radius);
}

interface ColourfulInterface extends ShapeInterface {
	void fillColor(String color);
}

class Circle1 implements ColourfulInterface{
	@Override
	public void draw() {
 		System.out.println("Draw a circle of radius 5");
	}
	@Override
	public void calculateArea(int radius) {
		System.out.println("Area of Circle Obtained is : "+(3.14)*radius*radius);	
	}
	@Override
	public void fillColor(String color) {
 		System.out.println("The colour filled in Circle is : "+color);
	}
}

public class Main6 {
	public static void main(String[] args) {
       Circle1 c=new Circle1();
       c.draw();
       c.calculateArea(5);
       c.fillColor("GREEN");
	}
}