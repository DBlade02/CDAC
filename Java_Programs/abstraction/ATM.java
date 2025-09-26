package abstraction;

public interface ATM {
	int cashback = 10; // public final static 
	
	void withdraw();
	void deposit(); // public abstract
	void transfer();

}
