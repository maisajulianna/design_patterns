public abstract class State {
    private CharacterGame game;

    public State(CharacterGame game) {
        this.game = game;
    }

    abstract void display();
    abstract void action();
    abstract void advance();

    void train() {
        System.out.println("Training...");
        int xp = game.getXP();
        xp++;
        game.setXP(xp);
        System.out.println("You have gained 1 experience point from training!");
        System.out.println(" ");
    }

    public void meditate() {
        System.out.println("Reach Intermediate level to meditate.");
    }
    public void fight() {
        System.out.println("Reach Expert level to fight");
    }
    abstract int getXPtoAdvance();
    abstract String getLevel();

}