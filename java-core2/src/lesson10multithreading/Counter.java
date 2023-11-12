package lesson10multithreading;

public class Counter {
    int userCounter = 0;

    synchronized void increment() {
        userCounter++;
    }

    public int getUserCounter() {
        return userCounter;
    }
}
