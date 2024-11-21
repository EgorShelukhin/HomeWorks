/* Задание 2:

Реализовать метод аналогичный заданию 1
Но на выходе важно сохранить последовательность такую же как в изначальном листе

На вход: 1 1 1 4 5 7 8 4 5 3
На выход 1 4 5 7 8 3
*/
package homework2.Collections;

import java.lang.reflect.Array;
import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(4);
        list.add(5);
        list.add(3);

        System.out.println(list);

        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println(set);
    }
}