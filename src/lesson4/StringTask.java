package lesson4;

public class StringTask {
    public static void main(String[] args) {
        String input = "Hello, are u :(. I am :( fine thanks";
        String[] str = input.split(" ");
        for (String s:
             str) {
            System.out.println(s);
        }

        String substring = input.substring(4);
        System.out.println(input.indexOf("H"));
        System.out.println(substring);
        char[] charArray = input.toCharArray();
        boolean equals = Character.valueOf('?').equals('!');
        System.out.println(equals);
    }

    static String replace(String input) {
        return "";
    }
}
