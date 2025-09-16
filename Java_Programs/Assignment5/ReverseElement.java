//Program to reverse elements an array
import java.util.Scanner;
public class ReverseElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array:  ");
        int size = scanner.nextInt();
        int arr [] = new int[size];if(size<=0)
        {
            System.out.println("Invalid size");
            return;
        }
        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array elements in reverse order:");
        for(int i=size-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
