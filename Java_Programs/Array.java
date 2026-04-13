public class Array {
    public static void main(String[] args) {
        int[] arr = {20,50,10,40,30};

    //     int max = arr[0];
    //     for(int i =1;i<arr.length;i++){
    //         if(arr[i]>max){
    //             max=arr[i];
    //         }
    //     }
    //     System.out.println("Maximum element form the array is: "+max);

// Outer loop: controls the number of passes
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop: compares adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Correct Swapping Logic
                    int temp = arr[j];     // Save arr[j] value
                    arr[j] = arr[j + 1];   // Move arr[j+1] to arr[j]
                    arr[j + 1] = temp;     // Move saved temp value to arr[j+1]
                }
            }
        }

        // Printing the sorted array
        System.out.println("Sorted Array:");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }


    }
}
