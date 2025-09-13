import java.util.Scanner;
public class IncomeTax{
		public static void main(String[] args) {
			Scanner scanner= new Scanner(System.in);
			System.out.println("Enter Salary:");
			double salary = scanner.nextDouble();
			scanner.close();
             double tax;
			if(salary<=250000){
              System.out.println("No Tax Applicable   Salary is :"+salary);
			}
			else if(salary>=250001&&salary<=500000){
                  tax=(salary*5)/100;
                 System.out.println("Tax Payable is :"+tax);
			}
			else if(salary>=500001&&salary<=1000000){
                  tax=(250000*5)/100+(((salary-500000)*(20))/100);
                 System.out.println("Tax Payable is :"+tax);
			}
			else if(salary>1000000){
                 tax=(250000*5)/100+(500000*20)/100+(((salary-1000000)*30)/100);
                 System.out.println("Tax Payable is :"+tax);
			}
			else{
                 System.out.println("Salary entered is Invalid:");

			}
		}
	}