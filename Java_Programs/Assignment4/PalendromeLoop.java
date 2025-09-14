//22. Write a program to check if a given string is a palindrome using a loop.
public class PalendromeLoop {
    public static void main(String[] args) {
        String str = "madam";
        String reversedStr = "";
        
        // Loop to reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        
        // Check if the original string is equal to the reversed string
        if (str.equals(reversedStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
    
}
