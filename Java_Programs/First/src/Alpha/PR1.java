package Alpha;
class A{
	private String name ;
	String Addr;
	int age ;
	double Pno;
	
	public A(String name, int age, double Pno, String Addr){
		this.name= name;
		this.age=age;
		this.Pno=Pno;
		this.Addr=Addr;
	}
	public void disp() {
		System.out.println("NAme is : "+name);
		System.out.println("Address is : "+Addr);
		System.out.println("Phone no is : "+Pno);
		System.out.println("Age is :"+age);
	}
}


public class PR1 {
	public static void main(String[] args) {
		A a = new A("Aditya MOgre", 10,1234567890, "Mumbai");
		a.disp();
		
		
	}
}
