import java.util.Scanner;

public class MainGame {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean again = true;

    public static void main(String[] args) {
        new CharacterGame().play();

        while (again) {
            playAgain();
        }
    }

    public static void playAgain() {
        System.out.println(" ");
        System.out.println("Press 1 to play again: (or anything else to stop)");
        int againInt = scanner.nextInt();
        if (againInt == 1 ) {
            new CharacterGame().play();
        } else {
            again = false;
        }
    }
}
