package exceptions;
public class NestedTryDemo {
public static void main(String[] args) {
	try {
//		System.out.println("Entered outer try");
//		int x = (int) (Math.random()*5);// 0-4
//		int res =  21 / x;
//		System.out.println(x);
		try {
			System.out.println("Entered 1st nested try");
			String s = null;
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.err.println(e);
		}
		try {
			System.out.println("Entered 2nd nested try");
			int[] arr = new int[5];
			arr[5] = 199139;
		}
		catch(ArithmeticException e) {
			System.err.println(e);
		}}
	catch(Exception e) {
		System.err.println(e);
	}
	System.out.println("Rest of the code follows.....");
}
}
