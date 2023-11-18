package lesson10multithreading;

public class UserLogIn extends Thread {

    private final Counter counter;

    public UserLogIn(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
