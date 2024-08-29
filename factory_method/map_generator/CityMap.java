package map_generator;

import java.util.Random;

public class CityMap extends Map {
    @Override
    public Tile createTile() {
        Random randomNum = new Random();
        int tileType = randomNum.nextInt(3);

        switch (tileType) {
            case 0:
                return new RoadTile();
            case 1:
                return new ForestTile();
            case 2:
                return new BuildingTile();
            default:
                return null;
        }
    }
}
