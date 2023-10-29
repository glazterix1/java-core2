package lesson6;

abstract class Figure {
    private int sideX;
    private int sideY;

    public Figure() {
    }

    public Figure(int sideX, int sideY) {
        this.sideX = sideX;
        this.sideY = sideY;
    }

    void sayAboutMe() {
        System.out.println("Я фигура");
    }

    abstract int square();

    public int getSideX() {
        return sideX;
    }

    public int getSideY() {
        return sideY;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "sideX=" + sideX +
                ", sideY=" + sideY +
                '}';
    }
}
