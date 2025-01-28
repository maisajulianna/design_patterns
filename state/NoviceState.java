public class NoviceState extends State {
    private CharacterGame game;
    private String[] actions = {"Train"};
    private String level= "novice";
    private int XPtoAdvance = 3;

    public NoviceState(CharacterGame game) {
        super(game);
        this.game = game;
    }

    @Override
    public void display() {
        System.out.println("STATS:");
        System.out.println("Level: " + this.level);
        System.out.println("XP: " + game.getXP());
        System.out.println("XP needed to advance: " + this.XPtoAdvance);
        System.out.println("Health points: " + game.getHealthPoints());
        System.out.println("Available actions: " + actions[0]);
    }
    @Override
    public void action() {
        while (true) {
            if (game.readUserChoice(actions) == 1) {
                train();
                return;
            } else {
                System.out.println("Please choose one of the options.");
            }
        }
    }
    @Override
    public void advance() {
        game.setState(new IntermediateState(game));
    }
    @Override
    public int getXPtoAdvance() {
        return XPtoAdvance;
    }
    @Override
    public String getLevel() {
        return level;
    }
}