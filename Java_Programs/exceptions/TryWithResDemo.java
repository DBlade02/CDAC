package exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResDemo {

	public static void main(String[] args) throws IOException{
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Enter Name");
			System.out.println(br.readLine());
			System.out.println("Enter age");
			int age = Integer.parseInt(br.readLine());
			System.out.println(age);
		}
//		catch(ArithmeticException e) {
//			System.out.println(e);
		
//		}
	}
}