// 25. Write a program to find the sum of all odd numbers between 1 and 50.
public class odd_sum {
    public static void main(String[] args) {
        int sum =0;
        for(int i=1;i<=50;i++){
            if(i%2!=0){
                sum = sum + i;
            }
        }
        System.out.println("The sum of all odd numbers between 1 and 50 is: " + sum);
    }   
}
