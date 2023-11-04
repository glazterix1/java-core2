package lesson7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRunner {
    /**
     * 1 - "name"
     * 2 - "name1"
     *
     * key - value
     * "Petya" - + 7 922 222 22 22
     *
     *
     */
    public static void main(String[] args) {
//        ArrayList<String> name = new ArrayList<>();
//        name.add("name1");
//        int i = name.indexOf("name1");
//        System.out.println(i);
//        System.out.println(name.get(i));

        Map<String, Integer> phones = new HashMap<>(); //создание Map

        phones.put("Sdfa", 22); // положить значение
        phones.put("Peter", 30);
        phones.put("Sveta", 50);
        System.out.println(phones);

        Integer i = phones.get("Egor");
        System.out.println(i);

        Integer remove = phones.remove("Ivan");
        System.out.println(phones);

        System.out.println(phones.containsKey("Ivan"));

        Set<String> strings = phones.keySet();
        System.out.println(strings);

        Collection<Integer> values = phones.values();
        System.out.println(values);

        Set<Map.Entry<String, Integer>> entries = phones.entrySet();
        System.out.println(entries);

        System.out.println(phones.isEmpty());

        for (Map.Entry<String, Integer> entry : entries) {
            Integer value = entry.getValue();
            phones.put(entry.getKey(), entry.getValue() + 20);
        }

        System.out.println(phones);
    }
}
