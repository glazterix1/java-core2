package lesson4;

public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person(22, "Иван");
        Person person1 = new Person(23, "aasdf");
        Person heesdfa = new Person(55, "he");

        Person hello22 = new Person(22, "Hell");
        person1 = person;
        Person person2 = new Person(44, "sdfasd");
        Person person3 = new Person(233, "bilbo");
        Person person4 = new Person("ASDFa");

        Function function = new Function();

        System.out.println(Math.max(22, 232));

        Integer.max(22, 23412);
        System.out.println(Integer.parseInt("2223"));

        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        System.out.println(person2.getName());

//        person.sayHello();
//        person1.sayHello();
//        person2.sayHello();
//        person3.sayHello();
//        System.out.println("--------------------");
//
//        Person[] persons = new Person[10];
//        for (Person pers : persons) {
//            System.out.println(pers);
//        }
    }
}
