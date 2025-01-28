public class IntermediateState extends State {
    private CharacterGame game;
    private String[] actions = {"Train", "Meditate"};
    private String level = "intermediate";
    private int XPtoAdvance = 6;

    public IntermediateState(CharacterGame game) {
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
        System.out.println("Available actions:");
        for (int i = 1; i <= actions.length; i++) {
            System.out.println(" " + actions[i-1]);
        }
    }
    @Override
    public void action() {
        while (true) {
            switch (game.readUserChoice(actions)) {
                case 1:
                    train();
                    return;
                case 2:
                    meditate();
                    return;
                default:
                    System.out.println("Please choose one of the options.");
            }
        }
    }
    @Override
    public void advance() {
        game.setState(new ExpertState(game));
    }

    @Override
    public void meditate() {
        // meditating increases health points
        System.out.println("Meditating...");

        int healthPoints = game.getHealthPoints();
        healthPoints++;
        game.setHealthPoints(healthPoints);

        System.out.println("You have gained 1 health point from training!");
        System.out.println(" ");
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