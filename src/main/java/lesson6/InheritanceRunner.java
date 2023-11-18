package lesson6;

import java.io.FileReader;

public class InheritanceRunner {
    public static void main(String[] args) {
//        Figure figure = new Figure(22, 22);
//        figure.sayAboutMe();
//        System.out.println(figure.square());
//
//        System.out.println(figure);

//        Triangle triangle = new Triangle(22, 22, 22);
//        Rectangle rectangle = new Rectangle(22, 22);

        Figure figure = new Triangle(22, 22, 22);
        Figure figure2 = new Rectangle(22, 22);

        "Hello".equals("Hello");

//        triangle.square();
//        rectangle.square();

        visovPloshadiFiguri(figure);

//        System.out.println(triangle);
//        triangle.sayAboutMe();
//        triangle.getSideX();
//        triangle.getSideY();
//        System.out.println(triangle.square());
//
//        System.out.println(triangle);
    }

    static void visovPloshadiFiguri(Figure figure) {
        int square = figure.square();
        System.out.println(square);
    }

    static Figure visovPloshadiFiguri(int sideX, int sideY) {
        return new Rectangle(sideX, sideY);
    }
}
