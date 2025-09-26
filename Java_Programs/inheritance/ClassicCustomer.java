package inheritance;

public class ClassicCustomer extends Customer{
    
	private double intRate;
	
	public ClassicCustomer(int cid, String cname, double balance, double intRate) {
		super(cid, cname, balance);
		this.intRate = intRate;
	}

	@Override
	public void dispCust() {
		super.dispCust();
		System.out.println("Interest Rate: "+intRate);
	}

	@Override
	public void calInterest() {
		double si = getBalance() * intRate * 5/100;
		System.out.println("Simple Interest: "+si);
	}
 
	
}
