package ui;

public class BFactory extends UiFactory {
    @Override
    public Button createButton(String text) {
        Button buttonB = new ButtonB(text);
        return buttonB;
    }

    @Override
    public Checkbox createCheckbox(String text) {
        Checkbox checkboxB = new CheckboxB(text);
        return checkboxB;
    }

    @Override
    public TextField createTextField(String text) {
        TextField textfieldB = new TextFieldB(text);
        return textfieldB;
    }}
