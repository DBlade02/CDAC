// Program to find nth largest / smallest element in array
public class SmallestLargest {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int n = 3;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(n+"th smallest element = "+arr[n-1]);
        System.out.println(n+"th largest element = "+arr[arr.length-n]);
    }
}
