package lesson6;

public class Rectangle extends Figure {

    public Rectangle(int sideX, int sideY) {
        super(sideX, sideY);
    }

    @Override
    int square() {
        System.out.println("Расчет площади прямоугольника");
        return 0;
    }
}
