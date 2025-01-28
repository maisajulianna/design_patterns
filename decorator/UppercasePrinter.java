public class UppercasePrinter extends PrinterDecorator {
    public UppercasePrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String text) {
        String uppercase = text.toUpperCase();
        super.print(uppercase);
    }
}
