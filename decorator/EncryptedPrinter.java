import java.util.Base64;
public class EncryptedPrinter extends PrinterDecorator {
    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String text) {
        Base64.Encoder encoder = Base64.getEncoder();
        String encryptedText = encoder.encodeToString(text.getBytes());
        System.out.println("encrypted text:");
        super.print(encryptedText);
    }
}

