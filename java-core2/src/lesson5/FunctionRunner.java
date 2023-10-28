package lesson5;

import java.util.Arrays;

public class FunctionRunner {
    public static void main(String[] args) {
        int[] numbers =  {22, 234, 24, 234};
        int[] numbers2 = new int[10];
        int[] ints = reverseArray(numbers);

        for (int n:
             ints) {
            System.out.println(n);
        }

        System.out.println(
                Arrays.toString(
                        reverseArray(numbers)
                )
        );
    }

    static int sum() {
        int i = 0;
        return ++i;
    }

    static int sameString(String name) {
        return name.length();
    }

    static int arraySum(int[] numbers) {
        var result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }

        return result;
    }

    static int[] reverseArray(int[] numbers) {
        int[] newArray = new int[numbers.length];
        int index = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            newArray[index] = numbers[i];
            index++;
        }
        return newArray;
    }
}
