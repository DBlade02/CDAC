package abstraction;

public class Java9Demo implements Java9Interface {
	@Override
	public void dispName() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
	
		Java9Interface.testStatic(); //
		
		Java9Demo demo = new Java9Demo();
		demo.dispName();
		demo.test();
		
	}

	
}
