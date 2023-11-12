package lesson10multithreading;

public class CustomThead extends Thread {

    @Override
    public void run() {
        System.out.println("Hello " + getName());
    }
}
