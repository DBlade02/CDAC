import java.util.Scanner;
public class Traffic_Light_System{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Signal 'R','Y','G': ");
		
		char signal = sc.next().charAt(0);
		sc.close();
		switch(signal){
		case 'R':
		case 'r':
			System.out.print("R means You need to STOP!!");
			break;
		case 'Y':
		case 'y':
			System.out.print("Y means You need to WAIT!!");
			break;
		case 'G':
		case 'g':
			System.out.print("G means You need to GOO!!");
			break;
		default:
			System.out.print("Error: You Enter Wrong Input");
			break;
		}
	}
}
