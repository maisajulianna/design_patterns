import ui.*;


public class ElementFactory {
    public static void main(String[] args) {

        // to change styles, change AFactory to BFactory
        UiFactory factory = new BFactory();

        Button button = factory.createButton("click!");
        button.display();
        System.out.println();

        Checkbox checkbox = factory.createCheckbox("accept?");
        checkbox.display();
        System.out.println();

        TextField textfield = factory.createTextField("write here");
        textfield.display();
    }
}
