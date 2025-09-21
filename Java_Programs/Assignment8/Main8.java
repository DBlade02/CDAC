/*Problem 8: Anonymous Inner Class Implementing an Interface - Create an interface
Greeting with a method sayHello(). Write a method generateGreeting() in another class
that uses an anonymous inner class to implement the Greeting interface and prints a
greeting message*/

interface Greeting {
	void sayHello();
}
class Main8{
	public static void main(String[] args) {
		
		Greeting g=new Greeting() {
			@Override
			public void sayHello() {
              System.out.println("Hello Good Morning");				
			}
		};
		g.sayHello();
	}
	
}

