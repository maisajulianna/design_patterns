public class XMLPrinter extends PrinterDecorator {
    public XMLPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String text) {
        String XMLText = ("<text>" + text + "</text>");
        super.print(XMLText);
    }
}