import java.util.Scanner;
class leapyr{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
			System.out.print("Enter the number : ");
			int yr = sc.nextInt();
			
			if((yr % 400 == 0) || ((yr % 4 == 0) && (yr % 100 != 0)))
			{
				System.out.print("The year is a leap year.");
			}
			else
			{
				System.out.print("The year is not a leap year.");
			}
			sc.close();
	}
}