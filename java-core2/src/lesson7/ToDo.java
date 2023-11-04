package lesson7;

import java.util.ArrayList;
import java.util.List;

public class ToDo {
    List<String> delos = new ArrayList<>();

    void add(String delo) {
        delos.add(delo);
    }

    void add(String delo, int index) {
        if (index > delos.size()) {
            delos.add(delo);
        } else {
            delos.add(index, delo);
        }
    }

    void edit(int index, String delo) {
        if (index > delos.size() - 1) {
            System.out.println("Дело не было заменено");
        } else {
            delos.set(index, delo);
        }
    }

    void delete(int index) {
        if (index > delos.size() - 1) {
            System.out.println("Дело не было удалено");
        } else {
            delos.remove(index);
        }
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "delos=" + delos +
                '}';
    }
}
