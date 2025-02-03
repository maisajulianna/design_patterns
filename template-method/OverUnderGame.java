import java.util.Random;
import java.util.Scanner;

public class OverUnderGame extends Game {
    Scanner scanner = new Scanner(System.in);
    int numberOfPlayers;
    int end;
    int correctNumber;
    int winner = 0;

    public void initializeGame(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        System.out.println("Welcome to a game of Over/Under!");
        System.out.println();
        System.out.println("The lowest possible value will be 1.");
        System.out.print("Pick the end of range: ");
        end = scanner.nextInt();

        correctNumber = new Random().nextInt(end) + 1;
    }

    public boolean endOfGame() {
        if (winner == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void playSingleTurn(int player) {
        System.out.println();
        System.out.println("It's player" + player + "'s turn!");
        System.out.print("Your guess: ");
        int guess = scanner.nextInt();

        if (guess == correctNumber) {
            winner = player;
            System.out.println("Correct!");
        } else if (guess < correctNumber && guess >= 1) {
            System.out.println("Under!");
        } else if (guess > correctNumber && guess < end) {
            System.out.println("Over!");
        } else {
            System.out.println("Not in range! Try again next round.");
        }
    }

    public void displayWinner() {
        System.out.println();
        System.out.println("The winner is player" + winner + "!");
    }
}
