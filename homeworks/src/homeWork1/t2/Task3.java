package homeWork1.t2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем сканнер
        int firstNumber = scanner.nextInt(); // Считываем первое числои
        int secondNumber = scanner.nextInt(); // Считываем второе число
        int iteration = firstNumber;

        while (iteration < secondNumber) {
            if (iteration % 5 == 0 && iteration % 10 != 0) {
                System.out.println(iteration);
            }
            iteration++;
        }
    }
}
