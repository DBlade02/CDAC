package iostreams;

import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {
		
		Console c = System.console();
		System.out.println("Enter Name");
		String name = c.readLine();
		System.out.println(name);
		
		System.out.println("Enter Passwd");
		String pwdString = c.readLine();
		System.out.println(pwdString);
	}

}
