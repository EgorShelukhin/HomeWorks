package homeWork1.t3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = null;
        String stopWord = "stop";

        while (!stopWord.equals(city)) {
            System.out.println("Введите название страны");
            city = scanner.next();
            if (stopWord.equals(city)) {
                break;
            }
            printCountyFromCity(city);
        }

    }

    private static void printCountyFromCity (String city) {
        switch (city) {
            case"Москва" :
            case"Владивосток":
            case"Ростов":
                System.out.println("Россия");
                break;
            case"Рим" :
            case"Милан":
            case"Турин":
                System.out.println("Италия");
                break;
            case"Ливерпуль" :
            case"Манчестер":
            case"Лондон":
                System.out.println("Англия");
                break;
            case"Берлин" :
            case"Мюнхен":
            case"Кёльн":
                System.out.println("Германия");
                break;
            default:
                System.out.println("Неизвестная страна");
        }
    }
}
