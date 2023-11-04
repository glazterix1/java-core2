package lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionsRunner {
    public static void main(String[] args) {
        String[] str = new String[10];
        List<String> str2 = new LinkedList<>() {};

        String[] str4 = {"sf", "SDF"};
        List<String> copyOf = List.of("afsdfa", "dsfaf", "sdfadf");

        System.out.println();

        ArrayList<String> copyList = new ArrayList<>(copyOf); // копирующий конструктор

        str[1] = "Egor";
        str[1] = "Ilya";
        str[9] = "Ilya";
        System.out.println(Arrays.toString(str));

        str2.add("Alexy");  // добавить элемент
        str2.add("Nastya");
        str2.add("Ruslan");

        str2.add(0, "SomeName");

        System.out.println(str2);

        str2.remove("Nastya");
        System.out.println(str2.get(1));

        System.out.println(str2);

        String s = str2.get(1); // получить элемент
        System.out.println(s.length());
        System.out.println(s);
        System.out.println(str2);

        str[1] = null;
        System.out.println(Arrays.toString(str));
        str2.remove(2); // удаление элемента
        System.out.println(str2);

        str2.set(0, "Vlad"); // поменять значение
        System.out.println(str2);

        System.out.println(str2.size());

        str2.clear(); // удалить все элементы
        System.out.println(str2);

        str2.add("Darya");

        System.out.println(str2.contains("Darya")); // содержится ли элемент в коллекции
        str2.addAll(copyOf);
        System.out.println(str2);

        Integer number = 1;
        String result = "";
        for (String name : str2) {
            result += number + " " + name + "\n";
            number++;
        }

        System.out.println(result);
    }
}
