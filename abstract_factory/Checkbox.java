public abstract class Checkbox {
    protected boolean checked;

    protected String text;

    public Checkbox(String text, boolean checked) {
        this.text = text;
        this.checked = checked;
    }
    public abstract void display();

    public void setText(String text) {
        this.text = text;
    }
}
