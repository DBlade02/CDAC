package inheritance;
public class Customer {
	private int cid;
	private String cname;
	private double balance;
	private static String bank = "SBI";

	public Customer(int cid, String cname, double balance) {
		this.cid = cid;
		this.cname = cname;
		this.balance = balance;
	}
	public void dispCust() {
		System.out.println(cid + " " + cname + " " + balance + " " + bank);
	}
    public void calInterest() {
    	double si = (balance*8.5*5)/100;
    	System.out.println("Interest Earned: "+si);
    }
    
	public double getBalance() {
		return balance;
	}
    
    
}
