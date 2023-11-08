package onlinelesson;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternRunner {
    public static void main(String[] args) {
        String regular = "\\d{3}";
        Pattern pattern = Pattern.compile("\\d{3}");

        Matcher matcher = pattern.matcher("123 sfsadf 123 asdfasdf 123 sdfasd 123");

        while(matcher.find()) {
            System.out.println(matcher.group());
            break;
        }

//        System.out.println(matcher.matches());
//        String number = "123 sfsadf 123 asdfasdf 123 sdfasd 123";
//
//        boolean matches = number.matches(regular);
//        System.out.println(matches);
//
//        String result = number.replaceAll("[^\\d]", "?");
//        System.out.println(result);
//
//        String[] split = number.split(regular);
//        System.out.println(Arrays.toString(split));
    }
}
