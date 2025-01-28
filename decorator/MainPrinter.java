public class MainPrinter {
    public static void main(String[] args) {

        // basic printer print
        Printer printer = new BasicPrinter();
        printer.print("Hello World!");
        System.out.println();

        Printer printer2 = new EncryptedPrinter(new XMLPrinter(new BasicPrinter()));
        printer2.print("Hello World!");
        System.out.println();

        Printer printer3 = new XMLPrinter(new EncryptedPrinter(new BasicPrinter()));
        printer3.print("Hello World!");
        System.out.println();

        Printer printer4 = new UppercasePrinter(new XMLPrinter(new BasicPrinter()));
        printer4.print("Hello World!");
        System.out.println();
    }
}
