package homeWork1.t2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble(); // число вводимое в консоль
        double result;

        if (number > -3 && number < 5) {
            result = secondFormula(number);
        } else if (number >= 5) {
            result = firstFormula(number);
        } else {
            result = thirdFormula();
        }
        System.out.println(result);
    }


    private static double firstFormula (double x) {
        double result = (x * x - 10) / (x + 7);
        return result;
    }
    private static double secondFormula (double x) {
        double result = (x + 3) * (x * x - 2);
        return result;
    }

    private static double thirdFormula () {
        return 420;
    }
}


