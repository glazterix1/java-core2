package lesson9;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRunner {
    public static void main(String[] args) {
        Stream.of("Hello", "My name");
        List<Integer> integers = List.of(22, 44, 44,  145, 250);

        List<String> strings = List.of("Ivan", "Alice", "Alice", "Bilbo", "Frodo");

//        strings.stream()
//                .skip(2)
//                .forEach(System.out::println);

//        List<Dish> menu = Dish.menu;
//        List<Boolean> collect = menu.stream()
//                .map(dish -> dish.isVegetarian())
//                .toList();
        // 1.Фильтарция
        // 2.Преобразование объекта Dish в String
        // 3.Добавить элементы в List
        List<Dish> menu = Dish.menu;

        Set<String> set = menu.stream()
                .filter((Dish dish) -> dish.getCalories() < 400)
                .map((Dish dish) -> dish.getName())
                .collect(Collectors.toSet());
    }
}
