import java.util.Base64;

public class EncryptedPrinter extends PrinterDecorator {
    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String text) {
        Base64.Encoder encoder = Base64.getEncoder();
        String encryptedText = encoder.encodeToString(text.getBytes());
        super.print(encryptedText);

        // System.out.println("decrypted: ");
        // decode(encryptedText);
    }
    public void decode(String text) {
        Base64.Decoder decoder = Base64.getDecoder();
        String originalText = new String(decoder.decode(text));
        super.print(originalText);
    }
}

