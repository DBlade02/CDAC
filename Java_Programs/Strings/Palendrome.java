public class Palendrome {

    public static void main(String[] args) {

        String str = "Aditya";

        String result = isPalendrome(str);

        System.out.println("The result of " + str + " is : " + result);
    }

    static String isPalendrome(String str) {

        str = str.toLowerCase();

        for (int i = 0; i < str.length() / 2; i++) {

            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return "Not Palindrome";
            }
        }

        return "Palindrome";
    }
}