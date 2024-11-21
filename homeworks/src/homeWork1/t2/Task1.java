package homeWork1.t2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Создаем сканнер который позволит считать числа с консоли
        int floar = scanner.nextInt(); // Считываем кол-во этйжей в доме
        if (floar <= 0) {
            System.out.println("Ошибка ввода: Обманщик! Не бывает таких домов");
            return; // return служит для досрочного выхода из метода
        }
        if (floar <= 4) {
            System.out.println(" Малоэтажный дом");
        } else if (floar <= 8) {
            System.out.println(" Среднеэтажный дом");
        } else {
            System.out.println("Многоэтажный дом. Це шо Дубаи???");
        }
    }
}

