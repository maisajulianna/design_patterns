public class MasterState extends State {
    private CharacterGame game;
    private String level = "master";

    public MasterState(CharacterGame game) {
        super(game);
        this.game = game;
    }

    @Override
    public void display() {
        System.out.println("YOU WIN !");
        System.out.println(" ");
        System.out.println("Congratulations, you have advanced to master level and completed the game.");

        System.out.println("FINAL STATS:");
        System.out.println("Level: " + this.level);
        System.out.println("XP: " + game.getXP());
        System.out.println("Health points: " + game.getHealthPoints());
    }
    @Override
    public void action() {
        System.out.println("The game is completed.");
    }
    @Override
    public void advance() {
        System.out.println("The game is completed.");
    }
    @Override
    public void train() {
        System.out.println("The game is completed.");
    }
    @Override
    public int getXPtoAdvance() {
        System.out.println("The game is completed.");
        return 0;
    }
    @Override
    public String getLevel() {
        return level;
    }
}