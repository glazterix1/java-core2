package onlinelesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Многопоточные коллекции
 */
public class ListThreadRunner {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> numbers = new CopyOnWriteArrayList<>();

        ConcurrentHashMap<Integer, Integer> integerIntegerConcurrentHashMap = new ConcurrentHashMap<>();

        BlockingQueue<Integer> integers = new ArrayBlockingQueue<>(20);

        ListThread listThread1 = new ListThread(numbers);
        ListThread listThread2 = new ListThread(numbers);
        ListThread listThread3 = new ListThread(numbers);
        ListThread listThread4 = new ListThread(numbers);
        ListThread listThread5 = new ListThread(numbers);
        ListThread listThread6 = new ListThread(numbers);
        ListThread listThread7 = new ListThread(numbers);
        ListThread listThread8 = new ListThread(numbers);
        ListThread listThread9 = new ListThread(numbers);
        ListThread listThread10 = new ListThread(numbers);

        listThread1.start();
        listThread2.start();
        listThread3.start();
        listThread4.start();
        listThread5.start();
        listThread6.start();
        listThread7.start();
        listThread8.start();
        listThread9.start();
        listThread10.start();

        listThread1.join();
        listThread2.join();
        listThread3.join();
        listThread4.join();
        listThread5.join();
        listThread6.join();
        listThread7.join();
        listThread8.join();
        listThread9.join();
        listThread10.join();

        System.out.println(numbers);
    }
}
