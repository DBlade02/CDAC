package nestedclasses;
public class Main {

	public static void main(String[] args) {	
	 Person p = new Person(){
			// class definition
		public void eat() {
			System.out.println("Fruits!");
		}
		};
        p.eat();
	}

}
