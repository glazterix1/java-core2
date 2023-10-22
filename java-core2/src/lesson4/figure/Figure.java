package lesson4.figure;

public class Figure {
    int sideA;
    int sideB;

    public Figure(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    int square() {
        return sideA * sideB;
    }
}
