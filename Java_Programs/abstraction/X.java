package abstraction;

public class X implements Printable {

	@Override
	public void show() {
		System.out.println("Shows....");
	}

	@Override
	public void print() {
		System.out.println("Printing....");
	}

	 public static void main(String[] args) {
		
		 Printable p = new X();
		 p.show();
		 p.print();
	}
	 
}
