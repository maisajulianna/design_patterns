package map_generator.map;

import map_generator.tile.Tile;

public abstract class Map {
    protected int rows;
    protected int columns;
    protected String type;
    protected Tile[][] tiles;

    public Map(int rows, int columns, String type) {
        this.rows = rows;
        this.columns = columns;
        this.type = type;

        tiles = new Tile[rows][columns];
        createMap();
    }

    protected abstract Tile createTile();

    private void createMap() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tiles[i][j] = createTile();
            }
        }
    }

    public String getType() {
        return this.type;
    }

    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(tiles[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }
}
