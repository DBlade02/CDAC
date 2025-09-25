import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter your choice 1:Rock 2:Paper 3:Scissor : ");
        int user = sc.nextInt();
        int computer = random.nextInt(3) + 1;
        if(user == computer){
            System.out.println("Tie");
        }
        else if(user == 1 && computer == 2 || user == 2 && computer == 3 || user == 3 && computer == 1){
            System.out.println("You lose");
        }
        else{
            System.out.println("You win");
        }

    }
    
}
