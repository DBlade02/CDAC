package nestedclasses;

public abstract class Person {
	abstract void eat();
	void speak() {
		System.out.println("Speaks Java!");
	}
	
	public static void main(String[] args) {
		Person p = new Person() {
			public void eat() {
				System.out.println("Biryani!");
			}
			@Override
			 void speak() {
				 System.out.println("Speaks Python!");
			 }
		};
		p.eat();
		p.speak();
	}
}

