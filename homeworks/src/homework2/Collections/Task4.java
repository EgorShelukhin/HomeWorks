package homework2.Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*Выполниь задание 3 но добавить доп условие - что имена контактов не должны повторяться

Если у нас есть контак
Номер: 8-977-220-33-11
Имя котакта: Саша Бык

То если мы захотим добавить контак
Номер: 8-955-444-44-22
Имя котакта: Саша Бык

То в нашей телефонной книге ничего не добавиться а в консоль выведется: имя Саша Бык занято

 */
public class Task4 {
    public static void main(String[] args) {

        TelephoneBook telephoneBook = new TelephoneBook();

        telephoneBook.addNumber("8-929-333-33-22", "Egorchik");
        telephoneBook.addNumber("8-901-527-33-22", "Lera");
        telephoneBook.addNumber("8-999-999-99-99", "Slavets");
        telephoneBook.addNumber("8-905-505-55-55", "Бык");
        telephoneBook.addNumber("8-905-505-55-55", "Бык");

        telephoneBook.receiveCall("8-905-505-55-55");
        telephoneBook.receiveCall("8-999-999-99-99");
        telephoneBook.receiveCall("8-905-505-55-53");

    }
    public static class TelephoneBook {

        private Map<String, String> contactBookMap = new HashMap<>();
        private Set<String> contactNameSet = new HashSet<>();

        public void addNumber(String telephone, String name) {
            if (contactNameSet.contains(name)) {
                System.out.println("Данное имя уже используется");
            } else {
                contactNameSet.add(name);
                contactBookMap.put(telephone, name);
                System.out.println("Контакт добавлен");
            }
        }
        //На вход в него подается номер, и если контакт нам известен, то мы выводим - звонит тот то
        //Если нет то выводим звонит неизвестный номер
        public void receiveCall (String telephone) {
            if (contactBookMap.containsKey(telephone)) {
                System.out.println("Звонит: " + contactBookMap.get(telephone));
            } else {
                System.out.println("Звонит: неизвестный номер");

            }
        }
    }
}

