package lesson7;

public class ToDoRunner {
    public static void main(String[] args) {
        ToDo toDo = new ToDo();

        toDo.add( "Buy milk", 20);
        toDo.add( "Drink coffee", 1);
        toDo.add( "Play guitar", 4);
        toDo.add( "Listen music", 20);

        toDo.listAll();
    }
}
