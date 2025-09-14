//16. Write a program to print the ASCII values of all lowercase alphabets.
public class ASCIIlower {
    public static void main(String[] args) {
        for(char ch = 'a'; ch <= 'z'; ch++) {
            int asciiValue = (int) ch;
            System.out.println("ASCII value of " + ch + " is: " + asciiValue);
        }
    }    
}
