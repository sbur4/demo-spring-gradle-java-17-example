package j11.new_file_methods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("example.txt");

        // Write a string to a file
        Files.writeString(path, "Java 11 Features");

        // Read String from the file
        String content = Files.readString(path);
        System.out.println(content);
    }
}
