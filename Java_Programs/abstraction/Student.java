package abstraction;

public class Student extends Person{

	@Override
	public void eat() {
		System.out.println("Biryani!");
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		super.talk();
		System.out.println("French");
	}
	// child specific
	public void study() {
		System.out.println("Java / Python");
	}
	
	
}
