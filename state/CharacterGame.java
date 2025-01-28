import java.util.InputMismatchException;
import java.util.Scanner;

public class CharacterGame {
    private static Scanner scanner = new Scanner(System.in);
    private State state;
    private String name;
    private int XP, healthPoints;

    public CharacterGame() {
        state = new NoviceState(this);
        this.XP = 0;
        this.healthPoints = 2;
    }

    // game logic
    public void play() {
        System.out.println(" ");
        System.out.println("Welcome to [GAME]");
        System.out.print("Name your character: ");
        name = scanner.nextLine();
        setName(name);

        System.out.println("Okay, let's play, " + getName() + "!");
        System.out.println(" ");

        while (true) {
            if (state == null) {
                System.out.println("Game out of order");
                return;
            }
            do {
                sleep();
                if (healthPoints <= 0) {
                    System.out.println("You have " + healthPoints + " health points.");
                    System.out.println("To continue playing, meditate to heal.");
                } else {
                    state.display();
                }
                sleep();
                state.action();
            } while (XP < state.getXPtoAdvance());
            state.advance();
            System.out.println("You have advanced to the next level!");
            if (state.getLevel().equals("master")) {
                state.display();
                break;
            }
        }
    }

    public int readUserChoice(String[] options) {
        do {
            System.out.println("\nSelect an option:");
            for (int i = 1; i <= options.length; i++) {
                System.out.println(i + ". " + options[i - 1]);
            }
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please choose one of the options.");
                scanner.next();
            }
        } while (true);
    }

    public void setState(State state) {
        this.state = state;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setXP(int xp) {
        this.XP = xp;
    }
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }
    public int getXP() {
        return XP;
    }
    public int getHealthPoints() {
        return healthPoints;
    }
    public void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }
    }
}
