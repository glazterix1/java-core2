package lesson10inputoutput;

import java.util.Scanner;

public class ScannerRunner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while(scanner.hasNext()) {
                String next = scanner.next();

                System.out.println("Введите стоп для остановки");
                if (next.equals("stop")) {
                    break;
                }

                System.out.println(next);
            }
        }
    }
}
