package lesson10inputoutput;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class WriteRunner {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "test2.txt");
        String text = "Hello from Java \n";

        List<String> list = List.of("hello from collection");

        Files.write(path, list);
        Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8);

//        lines.forEach(System.out::println);
//
//        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
//            bufferedWriter.write(text);
//            bufferedWriter.write(text);
//            bufferedWriter.write(text);
//        }
    }
}
