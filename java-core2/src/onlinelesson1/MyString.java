package onlinelesson1;

public class MyString {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("Name");
        for (int i = 0; i < 100_000; i++) {
            stringBuilder.append(i);
        }

        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime);
    }
}
