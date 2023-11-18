package lesson8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionsList {
    public static void main(String[] args) {
        // получение по индексу = O(1)
        // получение по значению = O(n)
        // вставка в конец = O(1)
        // вставка в середину = O(n)
        // удалеине с конца = O(1)
        // удаление в середине = O(n)
        List<Integer> list = new ArrayList<>();

        // получение по индексу = O(n)
        // получение по значению = O(n)
        // вставка в конец = O(1)
        // вставка в середину = O(n)
        // удалеине с конца = O(1)
        // удаление в середине = O(n)
        List<Integer> list2 = new LinkedList<>();

        Set<Integer> set = new HashSet<>();

        // получение по индексу = O(1)
        // получение по значению = O(1)
        // удаление = 0(1)
        // вставка = 0(1)
        Map<Integer, Integer> map = new HashMap<>();

        // hashMap с порядком добавления элементов
        Map<Integer, Integer> map1 = new LinkedHashMap<>();

        Map<Integer, Integer> treeMap = new TreeMap<>();
    }
}
