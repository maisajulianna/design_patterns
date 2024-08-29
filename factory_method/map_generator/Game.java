/*
main method
- createMap()
 */

package map_generator;

import java.util.Scanner;

public abstract class Game {
    public void play() {
        Scanner scanner = new Scanner(System.in);
        Map map;
        do {
            map = createMap();
            // (room.enter();
            System.out.println("Press enter to move to the next map ('q' to quit).");
        } while (!scanner.nextLine().equals("q"));
    }

    public abtract Map createMap();
}
