package lesson4;

public class Arrayes {
    public static void main(String[] args) {
        //0,  1,    2,   3
        int[] numbers = new int[100];
        int i = 0;
        int number = 0;
        while (i < numbers.length) {
            if (number % 13 == 0 || number % 17 == 0) {
                numbers[i] = number;
                i++;
            }
            number++;
        }

        for (int n : numbers) {
            System.out.println(n);
        }
        System.out.println(numbers);

        int numNum = 10;
        String  s = "";
        if (numNum > 0) {
            System.out.println("Больше");
            s = "sd";
        } else {
            System.out.println("Меньше");
            s = ":";
        }

        String sss = numNum > 0 ? "asdf" : "Mеньше";

        System.out.println(sss);
    }
}
