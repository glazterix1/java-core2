package lesson7;

import java.util.ArrayList;
import java.util.List;

public class ToDo {
    List<String> todos = new ArrayList<>();

    void add(String somethingTodo) {
        todos.add(somethingTodo);
    }

    void add(String somethingTodo, int index) {
        if (index > todos.size()) {
            todos.add(somethingTodo);
        } else {
            todos.add(index, somethingTodo);
        }
    }

    void edit(int index, String somethingTodo) {
        if (index > todos.size() - 1) {
            System.out.println("Дело не было заменено");
        } else {
            todos.set(index, somethingTodo);
        }
    }

    void delete(int index) {
        if (index > todos.size() - 1) {
            System.out.println("Дело не было удалено");
        } else {
            todos.remove(index);
        }
    }

    void listAll() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < todos.size(); i++) {
            stringBuilder.append(String.format("%d - %s", i, todos.get(i)));
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "todos=" + todos +
                '}';
    }
}
