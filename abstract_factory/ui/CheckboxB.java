package ui;

class CheckboxB extends Checkbox {
    private boolean checked;

    public CheckboxB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("[[ ]] " + text);
    }
}
