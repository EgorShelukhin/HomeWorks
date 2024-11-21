package homeWork1.t3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double dividend;
        double divider;
        for (int i = 0 ; i < 5; i++) {
            System.out.println("Введите делимое");
            dividend = scanner.nextDouble();
            System.out.println("Введите делитель");
            divider = scanner.nextDouble();

            if (divider == 0) {
                System.out.println("Деление на 0 запрещено");
                continue;
            }

            double result = dividend / divider;
            System.out.println(result);
        }
    }
}
