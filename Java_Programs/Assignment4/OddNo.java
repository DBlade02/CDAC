//34. Write a program to print the odd numbers between 1 and 100.
public class OddNo {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
    }
}
