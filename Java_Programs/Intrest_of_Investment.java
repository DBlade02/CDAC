//Calculate the simple interest on an investment using the formula: A = P * T * R / 100;
package Java_Programs;

public class Intrest_of_Investment {
    public static void main(String[] args) {
        double principal=1000.0;
        double rate =5.0;
        double time = 3.0;
        double Intrest_of_Investment =(principal*rate*time)/100;
        System.out.println("The Intrest_of_Investment is: " + Intrest_of_Investment);
    }
}
