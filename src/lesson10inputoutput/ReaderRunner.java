package lesson10inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class ReaderRunner {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "test.txt");

//        int[] numbers = {12, 23, 234,234};
//
//        Arrays.stream(numbers);

        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
            long count = bufferedReader.lines()
                    .map(string -> string.split(" "))
                    .flatMap(Arrays::stream)
                    .count();

            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
