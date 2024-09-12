public class MainPrinter {
    public static void main(String[] args) {
        Printer printer;

        // basic printer print
        printer = new BasicPrinter();
        printer.print("Hello World!");
        System.out.println();

        // encrypted printer print
        printer = new EncryptedPrinter(new BasicPrinter());
        printer.print("Hello World!");
        System.out.println();

        // print to file
        printer = new FilePrinter(new BasicPrinter());
        printer.print("Hello World!");
        System.out.println();
    }

}
