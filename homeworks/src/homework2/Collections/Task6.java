package homework2.Collections;

/*
Задание 6 (реально встречается на собесах)
Создать метод который на вход принимает арай лист
И выводит в консоль значение из листа с кол-вом дубликатов
Пример:
на вход: 1 7 2 3 3 3 7 1
На выход:
1 - 2
7 - 2
2 - 1
3 - 3
Порядок не строгий
 */

import java.util.*;

public class Task6 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(List.of(1, 7, 2, 3, 3, 3, 7, 1));

        duplicates(list);

    }

    public static void duplicates(ArrayList<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : list) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " + " + entry.getValue());
        }
    }
}