// Program to find min and max of array elements
public class MIn_Max {
    public static void main(String[] args) {
        int[] num = {10, 20, 5, 40, 15};
        int min = num[0];
        int max = num[0];
        for (int i = 0; i < num.length ; i++) {
            if(num[i]<min){
                min = num[i];
            }
            if(num[i]>max){
                max = num[i];
            }  
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
    
}
