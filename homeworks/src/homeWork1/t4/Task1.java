package homeWork1.t4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");

        int bigger8counter = 0;
        int counter1 = 0;
        int evenCounter = 0;
        int oddCounter = 0;
        int sum = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        int[] array = new int[number];


        for (int i = 0; i < array.length; i++) { // наполняем массив
            int randomVal = random.nextInt(10);
            array[i] = randomVal;
            sb.append(randomVal).append(", ");
        }

        sb.append("]");
        System.out.println("Количество сгенерированных чисел: " + number);
        System.out.println("Числа в массиве");
        System.out.println(sb);

        for (int i = 0; i < array.length; i++) { // проходимся по массиву
            int numb = array[i];

            if (numb > 8) {
                bigger8counter++;
            }

            if (numb == 1) {
                counter1++;
            }

            if (numb % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
            sum += numb;
        }

        System.out.println("Количество чисел больше 8: " + bigger8counter);
        System.out.println("Количество четных чисел: " + evenCounter);
        System.out.println("Количество нечетных чисел: " + oddCounter);
        System.out.println("Количество чисел равных 1: " + counter1);
        System.out.println("Сумма всех чисел: " + sum);
    }
}
