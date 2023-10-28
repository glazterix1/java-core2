package lesson5;

public class Rectangle {
    int sideX;
    int sideY;

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
    }

    int square() {
        return sideX * sideY;
    }

    void setSides(int newSideX, int newSideY) {
        sideX = newSideX;
        sideY = newSideY;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideX=" + sideX +
                ", sideY=" + sideY +
                '}';
    }
}
