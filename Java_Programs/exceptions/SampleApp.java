package exceptions;
import java.io.*;

public class SampleApp {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter Name:");
		String name = br.readLine();
		System.out.println("Your Name: "+name);
		try {
		System.out.println("Enter Age:");
		int age = Integer.parseInt(br.readLine()); // throw new NFE();
		System.out.println("Your Age: "+age);
		}
		catch(NumberFormatException e) {
			e.printStackTrace(); // object + desc + stack tracwe
			System.err.println(e); // object  + desc
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of the code follows!");
	}
}
