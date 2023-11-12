package lesson10multithreading;

public class ThreadRunner {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

        CustomThead customThead1 = new CustomThead();
        CustomThead customThead2 = new CustomThead();
        CustomThead customThead3 = new CustomThead();
        CustomThead customThead4 = new CustomThead();

        customThead1.start();
        customThead2.start();
        customThead3.start();
        customThead4.start();

        customThead1.join();
        customThead2.join();
        customThead3.join();
        customThead4.join();

        System.out.println("At the end of program");
    }
}
