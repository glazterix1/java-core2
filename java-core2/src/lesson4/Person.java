package lesson4;

public class Person {
    private int age;
    private String name;
    private Person person;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Person(String name) {
        age = 22;
        this.name = name;
    }

    void sayHello() {
        System.out.println("hello from " + name + " " + age);
    }

    void changeAge(boolean isAdult, int age) {
        age += 1;
    }

    void changeAge(int age, boolean isAdult) {
        if (isAdult) {
            age += 1;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 70) {
            System.out.println("Ошибка");
        }
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
