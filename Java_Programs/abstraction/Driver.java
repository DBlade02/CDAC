package abstraction;

import abstraction.Person;
import abstraction.Student;
import inheritance.ClassicCustomer;
import inheritance.Customer;

public class Driver {
	public static void main(String[] args) {
	
		Person p = new Student();
		p.eat();
		p.talk();
		
		new Student().study(); //
		
	}

}
