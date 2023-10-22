package lesson2;

public class Cycle {
    public static void main(String[] args) {
//        int i = 0;
//        for ( ; ;) {
//            System.out.println(i);
//        }
        int i = 0;
        while (i < 10) {
            if (i == 8) {
                break;
            }
            if (i == 5) {
                i++;
                continue;
            }
            System.out.println("Переменная " + i);
            i++;
        }
    }

    private static void cycleWhile() {
        int number = 0;
        do {
            System.out.println("В цикле " + number);
            number++;
        } while (number <= 5);

        int n = 0;
        int m = 31;
        while (n < m) {
            System.out.println(n + m);
            n++;
        }
    }
}
