import java.io.*;

/**
 * MyFileHandler class provides basic file I/O operations.
 * This class includes methods for writing to a file, reading from a file,
 * and appending content to a file.
 * The methods utilize Java's I/O classes to perform the operations.
 */
public class MyFileHandler {

    /**
     * Writes content to a file.
     *
     * @param filename The name of the file to write content to.
     * @param content The content to write to the file.
     * @throws IOException If an I/O error occurs during writing.
     */
    public static void writeToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        }
    }

    /**
     * Reads content from a file.
     *
     * @param filename The name of the file to read from.
     * @return The content of the file as a string.
     * @throws IOException If an I/O error occurs during reading.
     */
    public static String readFromFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString().trim();
    }
    // 
    /**
     * Appends content to an existing file.
     *
     * @param filename The name of the file to append content to.
     * @param content The content to append to the file.
     * @throws IOException If an I/O error occurs during appending.
     */
    public static void appendToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(content);
        }
    }
}
