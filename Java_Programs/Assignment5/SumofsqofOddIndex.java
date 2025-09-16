//Program to find sum of sqaures of odd index values
public class SumofsqofOddIndex {
    public static void main(String[] args) {
        int random = 1 * (int)(Math.random()*100);
        System.err.println("Random number = "+random);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum =0;
        for(int i=1;i<arr.length;i=i+2){
            sum = sum + (arr[i]*arr[i]);
            System.out.println("arr["+i+"] = "+arr[i]+" square = "+(arr[i]*arr[i])+" sum = "+sum);
        }
    }
}
