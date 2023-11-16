package onlinelesson2;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InputThread {
    private static int counter;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                if (scanner.hasNextInt()) {
                    executorService.submit(() -> {
                        int seconds  = scanner.nextInt();
                        Thread.sleep(seconds * 1000);
                        System.out.println("Sleep " + seconds);
                        return 1;
                    });
                }
            }
        }
    }
}
