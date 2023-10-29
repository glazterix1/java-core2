package lesson6;

public class Triangle extends Figure {
    int sideZ;

    public Triangle() {
    }

    public Triangle(int sideX, int sideY, int sideZ) {
        super(sideX, sideY);
        this.sideZ = sideZ;
    }

    @Override
    void sayAboutMe() {
        super.sayAboutMe();
        System.out.println("Я треугольника");
    }

    @Override
    int square() {
        System.out.println("Расчет площади треугольника");
        return sideZ * getSideX() * getSideY();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideZ=" + sideZ +
                "sideX=" + getSideX() +
                "sideY=" + getSideY() +
                '}';
    }
}

