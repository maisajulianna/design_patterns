public class ExpertState extends State {
    private CharacterGame game;
    private String[] actions = {"Train", "Meditate", "Fight"};
    private String level = "expert";
    private int XPtoAdvance =  10;

    public ExpertState(CharacterGame game) {
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

    public void action() {
        while (true) {
            switch (game.readUserChoice(actions)) {
                case 1:
                    if (game.getHealthPoints() > 0) {
                        train();
                    } else {
                        System.out.println(" ");
                    }
                    return;
                case 2:
                    meditate();
                    return;
                case 3:
                    if (game.getHealthPoints() > 0) {
                        fight();
                    } else {
                        System.out.println(" ");
                    }
                    return;
                default:
                    System.out.println("Please choose one of the options.");
            }
        }
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
    public void fight() {
        // fighting decreases health points but increases XP
        System.out.println("Fighting...");

        int healthPoints = game.getHealthPoints();
        int xp = game.getXP();
        healthPoints -= 1;
        xp++;
        game.setHealthPoints(healthPoints);
        game.setXP(xp);

        System.out.println("You have lost 1 health point and gained 1 experience point.");
        System.out.println(" ");
    }

    @Override
    public int getXPtoAdvance() {
        return XPtoAdvance;
    }
    @Override
    public void advance() {
        game.setState(new MasterState(game));
    }
    @Override
    public String getLevel() {
        return level;
    }
}