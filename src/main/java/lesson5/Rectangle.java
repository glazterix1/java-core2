package lesson5;

public class Rectangle {
    static final String NAME = "Rectangle";
    int sideX;
    private int sideY;
    static int count;

//    Rectangle() {
//
//    }

//    Rectangle() {
//        sideX = 15;
//        sideY = 15;
//        System.out.println("Контсруктур прямоугольника");
//    }

    Rectangle(int sideX, int sideY) {
        this.sideX = sideX;
        this.sideY = sideY;
        count++;
    }

    int square() {
        return sideX * sideY;
    }

//    void setSides(int newSideX, int newSideY) {
//    }

    public static int getCount() {
        return count;
    }

    public int getSideX() {
        return sideX;
    }

    public int getSideY() {
        return sideY;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideX=" + sideX +
                ", sideY=" + sideY +
                '}';
    }
}
