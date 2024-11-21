/* Задание 1:

Создать метод, который получает на вход arrayList<Integer>
А на выход возвращает коллекцию основанную на этом листе, но без повторяющихся элементов
Пример: на вход 1 8 4 3 8 5 1
На выход 4 8 3 5 1
Примечание (на выход не важна последовательность элементов т.е. если мы выведем их на консоль то вывод будет в рандомном порядке )
*/
package homework2.Collections;


import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,8,4,3,8,5,1));
        System.out.println(list);

        Set<Integer> set =  new HashSet<>(list);
        System.out.println(set);
    }
}