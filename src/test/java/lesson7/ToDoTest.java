package lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToDoTest {
    ToDo toDo;

    @BeforeEach
    void setUp() {
        toDo = new ToDo();
    }

    @Test
    void addToListSomeElement() {
        // GIVE

        // WHEN
        toDo.add("Play guitar", 15);

        // THEN
        Assertions.assertEquals(1, toDo.getTodos().size());
    }
}