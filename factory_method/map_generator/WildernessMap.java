package map_generator;

import java.util.Random;

public class WildernessMap extends Map {
    @Override
    public Tile createTile() {
        Random randomNum = new Random();
        int tileType = randomNum.nextInt(3);

        switch (tileType) {
            case 0:
                return new SwampTile();
            case 1:
                return new WaterTile();
            case 2:
                return new ForestTile();
            default:
                return null;
        }
    }
}