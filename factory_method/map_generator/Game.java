/*
main method
- createMap()
 */

package map_generator;

import map_generator.map.*;

public class Game {
    public static void main(String[] args) {

        int rows = 5;
        int columns = 5;

        // Map map = new CityMap(rows, columns, "city");
        Map map = new WildernessMap(rows, columns, "wilderness");

        System.out.println("Map type: " + map.getType());
        map.display();
    }
}
