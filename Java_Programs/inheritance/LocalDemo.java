package inheritance;

public class LocalDemo {
	private String name = "C-DAC Hyd";
	
	public void disp() {
		// local class 
		class Local{
			void msg() {
				System.out.println(name);
			}
		} // end 
		Local l = new Local();
		l.msg();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LocalDemo demo = new LocalDemo();
      demo.disp();
	}

}
