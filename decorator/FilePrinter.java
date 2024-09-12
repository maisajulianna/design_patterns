import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter extends PrinterDecorator {
    public FilePrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String text) {
        try {
            String filename = "printerfile.txt";
            FileWriter file = new FileWriter(filename);
            file.write(text);
            System.out.println("printed to file " + filename + ": " + text);
            file.close();
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
