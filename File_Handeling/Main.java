package File_Handeling;

// Simple File Handling Demo (Create, Write, Read)

import java.io.*;

public class Main {

    public static void main(String[] args) {

        // 1. Create and Write to File
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("demo.txt"))) {
            writer.write("Hello, this is file handling in Java!");
            writer.newLine();
            writer.write("Second line of text.");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }

        // 2. Read from File
        try (BufferedReader reader = new BufferedReader(new FileReader("demo.txt"))) {
            String line;
            System.out.println("\nReading file:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
