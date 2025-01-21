package ui;

public abstract class UiFactory {
    public abstract Button createButton(String text);
    public abstract Checkbox createCheckbox(String text);
    public abstract TextField createTextField(String text);
}
