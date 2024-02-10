import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            System.out.println("Please enter your move: rock, paper, or scissors");
            String userMove = scanner.nextLine().toLowerCase();
            int computerInt = random.nextInt(3);
            String computerMove;
            if (computerInt == 0) {
                computerMove = "rock";
            } else if (computerInt == 1) {
                computerMove = "paper";
            } else {
                computerMove = "scissors";
            }
            System.out.println("The computer played: " + computerMove);
            if (userMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if ((userMove.equals("rock") && computerMove.equals("scissors"))
                    || (userMove.equals("paper") && computerMove.equals("rock"))
                    || (userMove.equals("scissors") && computerMove.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }
        scanner.close();
    }
}