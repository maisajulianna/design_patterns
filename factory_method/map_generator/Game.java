/*
main method
- createMap()
 */

package map_generator;

import map_generator.map.*;

public class Game {
    public static void main(String[] args) {

        int rows = 10;
        int columns = 15;

        // Map map = new CityMap(rows, columns, "city");
        Map map = new WildernessMap(rows, columns, "wilderness");

        System.out.println("Map type: " + map.getType());
        map.display();
    }
}
