import java.util.Arrays;
public class Simple {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Eneter Number: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = Math.abs((int) (Math.random() * 100)); // Generating random numbers between 0 to 99
        }
        System.out.println("Array: " + Arrays.toString(arr));

        //min and max
        int min = arr[0];
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        //sum and average
        double sum = 0;
        for (int x = 0; x < arr.length; x++) {
            sum = sum + arr[x];
        }
        double avg = sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);

        //sorting the array
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        //Counting even and odd numbers
        int even = 0;
        int odd =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;

            }
            
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

        //Finding the second largest number
        int secLarge = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>secLarge && arr[i]<max){
                secLarge = arr[i];
            }
        }
        System.out.println("Second Largest: " + secLarge);

        reverse(arr); // Calling the reverse method
    }

    //Reverse the array
    static void reverse(int[] arr){
        int[] rev = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            rev[i] = arr[arr.length-1-i];
        }
        System.out.println("Reversed Array: " + Arrays.toString(rev));
    }
}