//27. Write a program to print the ASCII values of all uppercase alphabets.
public class ASCIIupper {
 public static void main(String[] args) {
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            int asciiValue = (int) ch;
            System.out.println("ASCII value of " + ch + " is: " + asciiValue);
        }
    }       
}
