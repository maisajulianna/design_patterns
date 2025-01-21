package ui;

public abstract class Checkbox {
    protected String text;
    protected boolean checked;

    public Checkbox(String text) {
        this.text = text;
    }

    public abstract void display();
    public void setText(String text) {
        this.text = text;
    }
}
