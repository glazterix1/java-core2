package lesson6;

public interface Visible {

    boolean isVisible();

    default void isGoodVisible() {
        System.out.println("Good visible");
    }
}
