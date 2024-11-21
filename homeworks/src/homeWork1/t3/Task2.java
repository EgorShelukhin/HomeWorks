package homeWork1.t3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dividend;
        double divider;


        while (true) {
            System.out.println("Введите делимое");
            dividend = scanner.nextDouble();
            System.out.println("Введите делитель");
            divider = scanner.nextDouble();
            if (divider == 0) {
                break;
                // можно также использовать return;
            }

            double result = dividend / divider;
            System.out.println(result);
        }
    }
}
