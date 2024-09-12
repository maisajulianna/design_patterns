class ButtonB extends Button {
    public ButtonB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("======B======");
        System.out.println("|| " + text + " ||");
        System.out.println("=============");
    }
}
