package map_generator;

public abstract class Map {

    public abstract Tile createTile();
    public void display() {
        int rows = 50;
        int columns = 50;

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                Tile tile = getCharacter();
            }

        }
    }
}
