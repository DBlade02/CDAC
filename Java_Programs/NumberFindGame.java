import java.util.Scanner;

public class NumberFindGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // (Math.random() * 100) generates a number from 0 to 99.
        int NumToGuess = (int) (Math.random() * 100);
        //How many tries the user has taken
        int NumOfTries = 0;
        //The user's guess, initialized to -1 to ensure the loop starts
        int Guess = -1;
        
        System.out.println("I am thinking of a number between 0 and 99...");
        // Loop until the user guesses the correct number
        while (Guess != NumToGuess) {
            System.out.print("Enter your guess: ");
            
            Guess = sc.nextInt();
            
            NumOfTries++;
            
            if (Guess < NumToGuess) {
                System.out.println("Higher! Try again.");
                System.out.println();
            } else if (Guess > NumToGuess) {
                System.out.println("Lower! Try again.");
                System.out.println();
            } else {
                System.out.println("Congratulations! You have guessed the number " + NumToGuess + " in " + NumOfTries + " tries.");
            }
        }
        sc.close();
    }
}