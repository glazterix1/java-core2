package lesson2;

public class Task2 {
    public static void main(String[] args) {
//        int number = 5;
//        int result = 1;
//        for(int i = 1; i <= number; i++) {
//            result = result * i;
//        }
//        System.out.println(result);

        int number = 5;
        boolean isSimple = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isSimple = false;
                break;
            } else {
                isSimple = true;
            }
        }
        System.out.println("Числов " + number + " Простое? " + isSimple);
    }
}
