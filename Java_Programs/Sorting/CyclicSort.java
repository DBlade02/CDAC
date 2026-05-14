import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 1, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // sorting via CyclicSort only one loop
    static void sort(int[] arr) {
        int i = 0;

        //loop for n-1 time for iteration
        while(i < arr.length) {
            int correct = arr[i] - 1;

            //checking whether the number is it on correct location or not , if not then swap it
            // The swaped number will also be checked again
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            
            //if it is correct then increment
            else {
                i++;
            }
        }
    }
    
    // Simple swaping
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}