package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=0, b=0;
		try {
		System.out.println("Enter two Nos:");
		a = scanner.nextInt(); // throw new IME();
		b = scanner.nextInt(); //
		}
		catch(InputMismatchException e) {
			System.err.println(e);
		}
		
	    int sum = a+b;
	    System.out.println(sum);
	    try {
	    int res = a/b; // throw new AE();
	    System.out.println(res);
	    }
	    catch(ArithmeticException e) {
	    	System.err.println(e);
	    }
	    
	    int prod = a*b;
	    System.out.println(prod);
	    
	    System.out.println("rest of the code......");	
	}

}
