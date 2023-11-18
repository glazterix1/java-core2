package lesson10multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    volatile boolean flag = false;

    AtomicInteger userCounter = new AtomicInteger(0);

    void increment() {
        userCounter.incrementAndGet();
    }

    public int getUserCounter() {
        return userCounter.get();
    }
}
