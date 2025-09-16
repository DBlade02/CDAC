// Program to search an element in array
import java.util.Scanner;
public class SearchArr {
    public static void main(String[] args) {
        
        int num [] = {10,20,30,40,50,60,70,80,90,100};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to search: ");
        int search = sc.nextInt();
        for(int i=0;i<num.length;i++){
            if(num[i]==search){
                System.out.println("Element found at index: " + i );
                System.out.println("ArrNo is " + num[i]);
                return;
            }
        }
        System.out.println("Element not in array");
    }
}