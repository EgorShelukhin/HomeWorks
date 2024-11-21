package homeWork1.t4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int max = 0;
        int min = 10001; // Так как рандомим макс число 10000 то изначальный минимум должен быть больше чтобы потом его менять
        int endingIn0Couner = 0;
        int endingIn0Sum = 0;
        int [] array = new int[100];
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");

        for (int i = 0; i < array.length; i++) {  // Наполняем массив рандомными значениями
            int randomVal = random.nextInt(10000);
            sb.append(randomVal).append(", ");
            array[i] = randomVal;
        }
        sb.append("]");
        System.out.println("Числа в массиве");
        System.out.println(sb);

        for (int i : array) {
            if (i > max) { // Если максимальное число которое мы нашли оказывается меньше чем число из массива то значит число из массива теперь максимальное
                max = i;
            }

            if (i < min) { // Если минимальное число которое мы нашли оказывается больше чем число из массива то значит число из массива теперь минимальное
                min = i;
            }

            if (i % 10 == 0) {
                endingIn0Couner++;
                endingIn0Sum += i;
            }
        }
        System.out.println("Маскимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        System.out.println("Кол-во чисел оканчивающихся на 0: " + endingIn0Couner);
        System.out.println("Сумма чисел оканчивающихся на 0: " + endingIn0Sum);
    }
}
