package lesson4.computer;

public class Laptop extends Computer {

//    public Laptop(int ssd, int rm) {
//        super(ssd, rm);
//    }

    @Override
    public void startUp() {
        System.out.println("Ноутбук запустился");
    }
}

