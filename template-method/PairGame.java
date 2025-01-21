import java.util.ArrayList;

public class PairGame extends Game {
    private int pairsNum;
    private ArrayList<Integer> players = new ArrayList<>();

    @Override
    public void initializeGame(int numberOfPlayers) {
        if (numberOfPlayers % 2 != 0) {
            System.out.println("Please play this game with an even number of players.");
        } else {
            pairsNum = numberOfPlayers / 2;
        }
        for (int i = 1; i <=pairsNum; i++) {
            players.add(i);
            System.out.println("Adding players to the game...");
        }
        System.out.println("The game has started with " + pairsNum + " pairs.");
    }
    public boolean endOfGame() {
        return true;
    }
    public void playSingleTurn(int player) {

    }

    public void displayWinner() {
        int winner = (int) (Math.random() * 1);
        System.out.println("The winner is player " + winner + "!");
    }
}