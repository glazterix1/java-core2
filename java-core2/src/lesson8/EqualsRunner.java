package lesson8;

import java.util.HashMap;
import java.util.Map;

public class EqualsRunner {
    public static void main(String[] args) {
        System.out.println(22 == 22);
        System.out.println("____________");

        Person ivan = new Person(22, "Ivan", "ivan@gmail.com");
        Person ivan1 = new Person(22, "Semen", "ivan@gmail.com");
        Person petya = new Person(1, "Petya", "petya@gmail.com");
        Person sveta = new Person(105, "Sveta", "sveta@gmail.com");

        System.out.println(ivan.equals(ivan1));

        System.out.println(ivan.getId().hashCode());

        Map<Integer, Person> users = new HashMap<>();
        users.put(ivan.getId(), ivan);
        Person person = users.get(22);
        System.out.println(person);

        users.put(ivan.getId(), ivan);


//        System.out.println(ivan.hashCode());
//        ivan.setMail("InvaIvanInva");
//        System.out.println(ivan.hashCode());
    }
}
