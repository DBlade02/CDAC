import java.util.Scanner;
class leapyr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		Float yr = sc.nextFloat();

		if(yr%4==0){
			System.out.println("The year is a leap year.");
		}
		else{
			System.out.println("The year is not a leap year.");
		}

	}
}