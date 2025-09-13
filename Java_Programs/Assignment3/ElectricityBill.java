import java.util.Scanner;
public class ElectricityBill{
		public static void main(String[] args) {
			Scanner scanner= new Scanner(System.in);
			System.out.println("Enter number of units:");
			int num_unit = scanner.nextInt();

			if(num_unit>=0&&num_unit<400){ 
 			int a =num_unit/100;
 			
 			if(num_unit>=400){
 				a=4;
 			}
			int total;
			switch(a){
			case 0:
				total = num_unit*5;
				System.out.println("Bill is : "+total);
				break;
			case 1:
				total = (100*5)+((num_unit-100)*6);
				System.out.println("Bill is : "+total);
				break;
			case 2:
				total = (100*5)+(100*6)+((num_unit-200)*7);
				System.out.println("Bill is : "+total);
				break;
			case 3:
		        total = (100*5)+(100*6)+(100*7)+((num_unit-300)*8);
				System.out.println("Bill is : "+total);
				break;
            case 4:
		        total = (100*5)+(100*6)+(100*7)+((num_unit-300)*8);
				System.out.println("Bill is : "+total);
				break;
			 
			}
		}
		else{

			System.out.println("Input should be positive only");
			
		}
		}
}