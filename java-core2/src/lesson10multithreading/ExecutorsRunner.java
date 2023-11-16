package lesson10multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        ExecutorService executorService2 = Executors.newCachedThreadPool();
        ExecutorService executorService3 = Executors.newWorkStealingPool();

        executorService.submit(() -> System.out.println(Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println(Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println(Thread.currentThread().getName()));
        executorService.submit(() -> System.out.println(Thread.currentThread().getName()));

        executorService.shutdown();
    }
}
