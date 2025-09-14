// 15. Write a program to check if a given string is a palindrome.
import java.util.Scanner;   
public class Palindrome01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String str = sc.nextLine();
        sc.close();
        String reversedStr = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.err.println("Reversed string: " + reversedStr);
        if(str.equals(reversedStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");}
        
    }
}
