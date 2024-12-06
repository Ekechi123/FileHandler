package tests;

import java.io.*;

/**
 * MyFileHandlerTest class is used to test the basic file operations provided
 * by the MyFileHandler class. The tests ensure that files are created, read,
 * and appended correctly.
 */
public class MyFileHandlerTest {

    /**
     * Main method to execute the tests.
     * The tests cover the creation, reading, and appending of files using
     * MyFileHandler class methods.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        try {
            System.out.println("Starting tests...");

            // Test: Create a file and write content
            String filename = "testFile.txt";
            String content = "Hello, world!";
            MyFileHandler.writeToFile(filename, content);  // Writes the content to the file

            // Test: Read content from file
            String readContent = MyFileHandler.readFromFile(filename);  // Reads content from the file
            System.out.println("Read Content: " + readContent);
            assert content.equals(readContent);  // Verify content matches

            // Test: Append content to file
            String appendContent = " Goodbye, world!";
            MyFileHandler.appendToFile(filename, appendContent);  // Appends content to the file

            // Verify appended content
            String finalContent = MyFileHandler.readFromFile(filename);  // Reads the updated content
            System.out.println("Final Content: " + finalContent);
            assert finalContent.equals(content + appendContent);  // Verify final content is correct

            System.out.println("All tests passed!");

        } catch (IOException e) {
            System.err.println("Test failed with error: " + e.getMessage());
        }
    }
}
