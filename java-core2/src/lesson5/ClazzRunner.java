package lesson5;

public class ClazzRunner {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(22, 22);
        Rectangle rect2 = new Rectangle(155, 11);

        Rectangle[] rects = {rect, rect, rect, rect};
        System.out.println(Rectangle.count);
        System.out.println(Rectangle.getCount());

//        rect.setSides(50, 45);

//        System.out.println(rect.sideX + " " + rect.sideY);
//        System.out.println(rect);

//        rect2.sideX = 100;
//        rect2.sideY = 115;

//        int result = rect.sideX * rect.sideY;
//        int result2 = rect2.sideX * rect2.sideY;

        int square = rect.square();
        int square1 = rect2.square();

        System.out.println(rect.getSideX());

        System.out.println(rect.square() == rect.square());
    }

    static void massiv(Rectangle[] rects) {
    }
}
