// Program to find sum of first and second halfs of an array
public class Arraysum {
   public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9};
    int sum1 =0;
    int sum2 =0;
    for(int i=0;i<arr.length/2;i++){
        sum1 = sum1 + arr[i];
    }
    for(int i=arr.length/2;i<arr.length;i++){
        sum2 = sum2 + arr[i];
    }
    System.out.println("Sum of first half = "+sum1);
    System.out.println("Sum of second half = "+sum2);
   } 
}
