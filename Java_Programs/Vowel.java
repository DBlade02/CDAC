//Write a program to check if a given character is a vowel or a consonant.
class Vowel{
    public static void main(String[] args){
        char ch = args[0].charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            System.out.print("The character is a vowel.");
        }
        else{
            System.out.print("The character is a consonant.");
        }
    }     
}    