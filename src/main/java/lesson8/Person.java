package lesson8;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private Integer id;
    private String name;
    private String mail;

    public Person(Integer id, String name, String mail) {
        this.id = id;
        this.name = name;
        this.mail = mail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id)
                && Objects.equals(name, person.name)
                && Objects.equals(mail, person.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, mail);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(person.id, id);

//        return id - person.id;

//        return if (id > person.id) {
//            return 1;
//        } else if (id < person.id) {
//            return -1;
//        } else {
//            return 0;
//        }
    }
}
