package ui;
// this class can be used to set text !

public abstract class Button {
    protected String text;

    public Button(String text) {
        this.text = text;
    }

    public abstract void display();
    public void setText(String text) {
        this.text = text;
    }
}
