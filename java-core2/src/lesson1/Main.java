package lesson1;

public class Main {
    public static void main(String[] args) {
        // 1.Сравнить результат умножения двух переменных с результатом сложения 2х других опреаторов;
        // 2. Сохранить результат лигического выражения с двумя переменными в переменной boolean,
        // использовать результат этой переменной в другом выражении в котором сравнивается 2 целночисленных значения.
        // 3.
        // > < >= <== == !=
        int i = 20 * 5;
        int i1 = 15 + 70;
        boolean isTrue = i  > i1;
        boolean result = isTrue || (2 == 4) && (5 < 10);
        System.out.println(result);
//        int number = 20;
//        System.out.println(number == 0);
//        System.out.println(number != 0);
//        // && || !
//        System.out.println(!(10 > 0));
    }

    private static void op() {
        // + - * / %
        /*
        1.Выполнить операции используя * и + с четырьмя перменными, сделать так чтобы сложение выполнилось первым;
        2.Выполнить деление по модулю с двумя пременными, во втором выражении результат умножить на первую переменную.
        3.Создать переменную целночиленную и другом выражении сложить резултат ее инкремента с другим числом.
         */
        int number = 22;
        int number2 = 42;
        System.out.println(number + number2);
        number = number = 1;
        System.out.println(number);
        System.out.println();
        number /= 1;
        System.out.println(number);
        System.out.println(number);
        number++;
        double result = (double) 22 / 3;
        System.out.println(result);
    }

    private static void primitives() {
        System.out.println(22);
        System.out.println(222344444342354234L);
        System.out.println(0.2333);
        System.out.println(0.2333);
        System.out.println(0.2333F);
        System.out.println('d');
        System.out.println("dfa");
        System.out.println(false);
        System.out.println('a');

        System.out.println("Char value" + " " + Integer.valueOf('a'));

        int number;
        number = -22;  // init

        int sym = 'd';
        byte bigNumber = (byte) 128;
        System.out.println(bigNumber);
    }
}
