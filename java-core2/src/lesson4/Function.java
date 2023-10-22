package lesson4;

import java.util.Arrays;

public class Function {
    //[модификаторы] [возварщяемое значение] [имя] [параметры]
    public static void main(String[] args) {
//        int[] number2 = {2, 2};
//
//        for (int num : number2) {
//            System.out.println(num);
//        }
        System.out.println(Arrays.toString(square(10)));
    }

    static boolean isSimple(int number) {
        boolean isSimple = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isSimple = false;
                return isSimple;
            } else {
                isSimple = true;
            }
            return isSimple;
        }
        return true;
    }

    static int[] square(int bound) {
        int[] numbers = new int[bound];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * i;
        }

        return numbers;
    }
}
