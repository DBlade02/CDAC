//32. Write a program to check if a given string is a pangram.
import java.util.Scanner;
public class Pangram {
    public static void main(String[] args) {
        System.out.println("Enter a string to check if it is a pangram: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        sc.close();
        boolean[] alphabet = new boolean[26];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                index = ch - 'a';
                alphabet[index] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                System.out.println("The given string is not a pangram.");
                return;
            }
        }
        System.out.println("The given string is a pangram.");
    }
    
}
