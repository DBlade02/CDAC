package inheritance;

import inheritance.ClassicCustomer;
import inheritance.Customer;

public class Driver {
	public static void main(String[] args) {
		Customer c1 = new Customer(111, "ABC", 100000);
		c1.calInterest();
		c1.dispCust();
		
		Customer cc = new ClassicCustomer(222, "XYZ", 100000, 9.5);
		cc.calInterest(); // CC
		cc.dispCust(); // CC
		
//		c1 = cc; // upcasting
//		
//	    c1.calInterest();  // CC - dynamic binding =>RTP
//	    c1.dispCust(); // CC - dynamic binding - RTP

	}

}
