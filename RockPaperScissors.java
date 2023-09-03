import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("Welcome to Rock ,Paper ,Scissor ! ");
        while (true) {
            String[] options = { "Rock", "Paper", "Scissors" };
            String computerMove = options[rn.nextInt(options.length)];
            String playerMove;

            while (true) {
                System.out.println("Choose your move (Rock, Paper, or Scissors):");
                playerMove = sc.nextLine();
                if (playerMove.equalsIgnoreCase("Rock") || playerMove.equalsIgnoreCase("Paper")
                        || playerMove.equalsIgnoreCase("Scissors")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move");
            }

            System.out.println("Computer played: " + computerMove);

            if (playerMove.equalsIgnoreCase(computerMove)) {
                System.out.println("The game was a tie!");
            } else if (playerMove.equalsIgnoreCase("rock")) {
                if (computerMove.equalsIgnoreCase("paper")) {
                    System.out.println("You lose!");
                } else if (computerMove.equalsIgnoreCase("scissors")) {
                    System.out.println("You win!");
                }
            } else if (playerMove.equalsIgnoreCase("paper")) {
                if (computerMove.equalsIgnoreCase("scissors")) {
                    System.out.println("You lose!");
                } else if (computerMove.equalsIgnoreCase("rock")) {
                    System.out.println("You win!");
                }
            } else if (playerMove.equalsIgnoreCase("scissors")) {
                if (computerMove.equalsIgnoreCase("paper")) {
                    System.out.println("You win!");
                } else if (computerMove.equalsIgnoreCase("rock")) {
                    System.out.println("You lose!");
                }
            }

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = sc.nextLine();

            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for playing Rock, Paper ,Scissors !");
                break;
            }
        }
        sc.close();
    }
}
