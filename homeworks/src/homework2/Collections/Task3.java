/* Задание 3:

Сделать аналог контактной книги использовать для этого хэшмапу
Ключом должен быть номер телефона значением - имя котакта
Условно
Номер: 8-977-220-33-11
Имя контакта: Саша
Имена контаков могут повторяться
*/

package homework2.Collections;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("8-929-333-33-22", "Egorchik");
        map.put("8-901-527-33-22", "Lera");
        map.put("8-999-999-99-99", "Slavets");
        map.put("8-905-505-55-55", "Julia");
        map.put("8-985-511-55-55", "Lera");
        System.out.println(map);

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}