package lesson9exception;

import java.io.FileNotFoundException;

public class ExceptionRunner {
    public static void main(String[] args) {
//        delenieNa0(0);

        try {
            someThrow();
        } catch (UserNotFoundException exception) {
            exception.printStackTrace();
        }

//        String str = null;
//
//        System.out.println(str.length());
//
//        dengerMethod();
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");

        int[] numbers = {23, 323, 23};

        int number = numbers[15];
    }

    static void someThrow() {
        throw new UserNotFoundException();
    }
}
//    }

//    static void delenieNa0(int number) throws ArithmeticException {
//        try {
//            System.out.println(9 / number);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//    }

//    static void dengerMethod()  {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new UserNotFoundException(e);
//        }
//    }
//}
