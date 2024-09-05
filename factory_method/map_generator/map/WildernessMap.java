package map_generator.map;

import map_generator.tile.*;
import java.util.Random;

public class WildernessMap extends Map {

    private static final Tile[] WILDERNESS_TILES = {
            new SwampTile(),
            new WaterTile(),
            new ForestTile()
    };

    public WildernessMap(int rows, int columns, String type) {
        super(rows, columns, type);
    }

    @Override
    protected Tile createTile() {
        Random random = new Random();
        return WILDERNESS_TILES[random.nextInt(WILDERNESS_TILES.length)];
    }
}