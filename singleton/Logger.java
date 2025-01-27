import java.io.*;

public class Logger {
    private static Logger instance;
    private PrintWriter writer;

    private Logger() {
        createFile("log.txt");
    }

    private void createFile(String name) {
        try {
            File file = new File(name);
            if (!file.exists()) {
                file.createNewFile();
            }
            writer = new PrintWriter(new FileWriter(file, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setFileName(String name) {
        close();
        createFile(name);
    }

    public void write(String text) {
        if (writer != null) {
            writer.println(text);
            writer.flush();
        } else {
            System.out.println("No writer initialized");
        }
    }

    public void close() {
        if (writer != null) {
            writer.close();
        }
    }
}
