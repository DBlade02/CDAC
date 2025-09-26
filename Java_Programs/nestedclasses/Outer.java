package nestedclasses;

public class Outer {
	private String name = "C-DAC Hyd";

	class Inner {
		public void msg() {
			System.out.println(name);
		}
	} // end

	public void disp() {
		Inner in = new Inner();
		in.msg();
	}

	public static void main(String[] args) {
//		Outer out = new Outer();
//		out.disp();
//		
//		Outer.Inner in = out.new Inner();
//		in.msg();
		
		Outer out = new Outer();
		out.disp();
		
	}

}
