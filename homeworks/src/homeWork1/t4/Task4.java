package homeWork1.t4;

import java.util.Random;

public class Task4 {

    public static void main(String[] args) {
        Random random = new Random();
        int max = 0;
        int sum;
        int maxI = 1;
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

        for (int i = 1; i < array.length - 1; i++ ) {
             sum = array[i - 1] + array[i] + array[i + 1];
             if (sum > max) {
                 max = sum;
                 maxI = i - 1;
                }
            }

        System.out.println("Маскмильная сумма: " + max);
        System.out.println("Индекс Первого элемент из 3: " + maxI);
        System.out.println("Последовательность чисел с макс суммой: " + array[maxI] + "," + array[maxI + 1] + "," + array[maxI + 2] );
        }
}
