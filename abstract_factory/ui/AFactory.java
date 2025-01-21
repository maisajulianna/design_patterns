package ui;

public class AFactory extends UiFactory {

    @Override
    public Button createButton(String text) {
        Button buttonA = new ButtonA(text);
        return buttonA;
    }

    @Override
    public Checkbox createCheckbox(String text) {
        Checkbox checkboxA = new CheckboxA(text);
        return checkboxA;
    }

    @Override
    public TextField createTextField(String text) {
        TextField textfieldA = new TextFieldA(text);
        return textfieldA;
    }
}
