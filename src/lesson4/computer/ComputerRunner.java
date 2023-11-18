package lesson4.computer;

public class ComputerRunner {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();

        laptop.startUp();

        System.out.println(laptop.ssd);
    }
}
