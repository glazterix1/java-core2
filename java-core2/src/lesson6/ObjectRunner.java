package lesson6;

public class ObjectRunner {
    public static void main(String[] args) {
        Figure figure = new Rectangle(22, 22);
        Figure figure1 = new Triangle(22, 22, 22);
        Object figure2 = new Triangle(22, 22, 22);
        Visible figure3 = new Triangle(22, 22, 22);
        figure3.isVisible();
        figure3.isGoodVisible();
        figure.square();
        figure2.toString();
    }

    void showSquare(Figure figure) {
        figure.square();
    }

//    void showSqure2(Triangle triangle) {
//    }
}
