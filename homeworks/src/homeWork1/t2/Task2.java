package homeWork1.t2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем сканнер
        int firstNumber = scanner.nextInt(); // Считываем первое числои
        int secondNumber = scanner.nextInt(); // Считываем второе число

        for (int i = firstNumber; i < secondNumber; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.println(i);
            }
        }
    }
}
