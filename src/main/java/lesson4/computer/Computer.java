package lesson4.computer;

public class Computer {
    int ssd;
    int rm;

    public Computer() {

    }

    public Computer(int ssd, int rm) {
        this.ssd = ssd;
        this.rm = rm;
        System.out.println("В компутер");
    }

    int square() {
        return ssd * rm;
    }

    public void startUp() {
        System.out.println("Копутер запустился");
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }
}
