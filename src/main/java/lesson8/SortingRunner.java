package lesson8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortingRunner {
    public static void main(String[] args) {
        //Неизменяемый спискок
        List<Integer> integers = List.of(1, 22, 22);

        System.out.println(integers.getClass());

        //создает лист фиксированной длины
        List<Integer> list = Arrays.asList(22, 140, 1, 234);
        System.out.println(list.getClass());

        Collections.sort(list);
        System.out.println(list);

        Person person1 = new Person(55, "Semen", "semen@gmail.com");
        Person person2 = new Person(1, "Petya", "petya@gmail.com");
        Person person3 = new Person(1, "Petya", "petya@gmail.com");
        Person person4 = new Person(1555555, "Sveta", "sveta@gmail.com");

        System.out.println(person1.compareTo(person2));

        List<Person> persons = Arrays.asList(new Person(22, "Ivan", "ivan@gmail.com"),
                new Person(55, "Semen", "semen@gmail.com"),
                new Person(1, "Petya", "petya@gmail.com"),
                new Person(10055, "Sveta", "sveta@gmail.com")
        );

        Map<Integer, Person> map = new HashMap<>();
        map.put(person1.getId(), person1);
        map.put(person2.getId(), person2);
        map.put(person3.getId(), person3);
        map.put(person4.getId(), person4);

        System.out.println(map);

        Map<Integer, Person> treeMap = new TreeMap<>(map);
        System.out.println(treeMap);

//        Collections.sort(persons, new PersonComparator());
//        System.out.println(persons);

//        Collections.sort(persons);
//        System.out.println(persons);
    }
}
