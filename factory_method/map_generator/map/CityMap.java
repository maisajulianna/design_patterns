package map_generator.map;

import map_generator.tile.*;
import java.util.Random;

public class CityMap extends Map {
    private static final Tile[] CITY_TILES = {
            new RoadTile(),
            new ForestTile(),
            new BuildingTile()
    };

    public CityMap(int rows, int columns, String type) {
        super(rows, columns, type);
    }

    @Override
    protected Tile createTile() {
        Random random = new Random();
        return CITY_TILES[random.nextInt(CITY_TILES.length)];
    }
}
