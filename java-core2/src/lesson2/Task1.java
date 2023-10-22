package lesson2;

/**
 * Дан порядковый номер месяца.
 * Вывести на консоль пору года, к
 * которой относится месяц.
 */
public class Task1 {
    public static void main(String[] args) {
        // int, short, String, enum
        int value = 2;
        String resultNumber = switch (value) {
            case 1, 2, 3 -> "sout";
            case 4 -> "sdfs";
            default -> "sdofu";
        };

        int month = 3;
        int value22 = 0;
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
            value22 = 12;
        } else if (month >= 3 && month <= 5) {
            System.out.println("Весна");
            System.out.println();
            System.out.println();
        } else if (month >= 6 && month <= 8) {
            System.out.println("Лето");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Осень");
        }

        int number = 123;
        System.out.println(127 % 2 == 0);
    }

    /**
     * рубль 1 !11
     * <p>
     * рублей 5, 6, 7, 8, 9, 10, 11-19
     * <p>
     * рубля 2, 3, 4
     */
    public static void rubles() {
        int rubles = 123;
    }
}












