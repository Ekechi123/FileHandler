import java.io.*;

public class MyFileHandlerTest {

    public static void main(String[] args) {
        try {
            System.out.println("Starting tests...");

            // Test: Create a file and write content
            String filename = "testFile.txt";
            String content = "Hello, world!";
            MyFileHandler.writeToFile(filename, content);

            // Test: Read content from file
            String readContent = MyFileHandler.readFromFile(filename);
            System.out.println("Read Content: " + readContent);
            if (content.equals(readContent)) {
                System.out.println("Test passed for writing and reading.");
            } else {
                System.err.println("Test failed for writing and reading.");
            }

            // Test: Append content to file
            String appendContent = " Goodbye, world!";
            MyFileHandler.appendToFile(filename, appendContent);

            // Verify appended content
            String finalContent = MyFileHandler.readFromFile(filename);
            System.out.println("Final Content: " + finalContent);
            if (finalContent.equals(content + appendContent)) {
                System.out.println("Test passed for appending content.");
            } else {
                System.err.println("Test failed for appending content.");
            }

            System.out.println("All tests executed.");

        } catch (IOException e) {
            System.err.println("Test failed with error: " + e.getMessage());
        }
    }
}

