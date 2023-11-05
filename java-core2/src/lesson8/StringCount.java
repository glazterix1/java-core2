package lesson8;

import java.util.HashMap;
import java.util.Map;

public class StringCount {
    public static void main(String[] args) {
        String text = """
                Мне осталась одна забава:
                Пальцы в рот — и веселый свист.
                Прокатилась дурная слава,
                Что похабник я и скандалист.
                Ах! какая смешная потеря!
                Много в жизни смешных потерь.
                Стыдно мне, что я в бога верил.
                Горько мне, что не верю теперь.
                Золотые, далекие дали!
                Все сжигает житейская мреть.
                И похабничал я и скандалил
                Для того, чтобы ярче гореть.
                """;

        Map<String, Integer> words= new HashMap<>();
        String[] s = text.split(" ");

        String replace = text.replaceAll("[\\.!,]", "");
        System.out.println(replace);
    }
}
