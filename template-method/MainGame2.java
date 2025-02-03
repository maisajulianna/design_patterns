import java.util.Scanner;

public class MainGame2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many would like to play? ");
        int numberOfPlayers = scanner.nextInt();

        Game overUnderGame = new OverUnderGame();
        overUnderGame.play(numberOfPlayers);

        scanner.close();
    }
}