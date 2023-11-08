package onlinelesson;

public enum Colour {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    YELLOW(15, 15, 15);

    int r;
    int g;
    int b;

    Colour(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }
}
