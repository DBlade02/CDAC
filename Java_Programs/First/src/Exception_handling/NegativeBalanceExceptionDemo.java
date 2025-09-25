/*Problem 6: Create Customer class with the relevant information like name, address, id, phone no etc. 
Write a parameterized constructor and relevant methods (disp(), etc) appropriately.
Create Account class with account type, account number, minimum balance etc., Write calculateInterest method (use simple
interest – assume time and rate appropriately).
Create a user defined exception class
“NegativeBalanceException” and throw that exception when there
is negative balance while calculating the interest.
Use Account class in Customer class display the details of
customers with account information. (No Inheritance – use
association only)*/

package Exception_handling;
class Customer{
	String name;
	String Address;
	int id;
	int pNo;
	
	public Customer(String name, String Address, int id, int pNo){
		this.name= name;
		this.Address= Address;
		this.id = id;
		this.pNo= pNo;
	}
	
	void disp() {
		System.out.println("Name : "+this.name);
		System.out.println("Address : "+this.Address);
		System.out.println("ID : "+this.id);
		System.out.println("Phone No : "+this.pNo);
	}
	
}

class Account
{
	String accType;
	int AccNo;
	int MinBalance;
	
	public Account(String accType, int AccNo, int MinBalance) 
	{
		this.accType = accType;
		this.AccNo = AccNo;
		this.MinBalance = MinBalance;
	}
	
	void disp() {
		System.out.println("Account Type : "+this.accType);
		System.out.println("Account Number : "+this.AccNo);
		System.out.println("Minimum Balance : "+this.MinBalance);
	}	
	
}

class ExceptionMain{
	void disp()throws Exception{
		try {
			throw new Exception();
		} 
		catch (Exception e) {
			System.out.println("Exception"+e);
		}
	}
}

public class NegativeBalanceExceptionDemo {

	public static void main(String[] args) {
		Customer c1 = new Customer("Aditya Mogre","Kolkata",12345,1234567890);
		Account a1 = new Account("Savings",1234567890,50000);
		ExceptionMain e1 = new ExceptionMain();
		c1.disp();
		System.out.println();
		a1.disp();
	}	 
}
