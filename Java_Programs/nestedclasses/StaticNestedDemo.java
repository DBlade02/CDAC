package nestedclasses;

public class StaticNestedDemo {
	static private int x = 199139;
	
	static class Nested{
		static void msg() {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
//		StaticNestedDemo.Nested demo = new Nested();
//		demo.msg();
		
		StaticNestedDemo.Nested.msg();
	}

}
