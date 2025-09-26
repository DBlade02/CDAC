package abstraction;
public interface Java9Interface {
	String name = "C-DAC Hyd";
	void dispName();
	default void test() {
		System.out.println("its a default method");
		testPrivate();
	}
	static void testStatic() {
		System.out.println("Its a static method");
		testPvtStatic();
	}
	private void testPrivate() {
		System.out.println("its a private method");
	}
	private static void testPvtStatic() {
		System.out.println("Its a private static method");
	}
	
}
