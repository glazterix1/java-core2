package lesson10inputoutput;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class IORunner {
    public static void main(String[] args) throws IOException {
        try (InputStream inputStream = Files.newInputStream(Path.of("resources", "avatar.png"));
             OutputStream outputStream = Files.newOutputStream(Path.of("resources", "avatar22.png"))) {

            byte[] bytes = inputStream.readAllBytes();

            System.out.println(bytes.length);

            outputStream.write(bytes);
        }
    }
}
