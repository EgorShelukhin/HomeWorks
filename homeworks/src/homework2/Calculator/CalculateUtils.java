package homework2.Calculator;

public class CalculateUtils {

    /*
     * Реализовать в данном классе статически методы которые будут возвращать
     * значение типа int (на деление возвращать дабл) и методы будут соответствовать метаметическим операциям
     * умножить (multiply), делить (divide), плюсануть (plus), заминусить (minus).
     *
     * */

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Деление на 0 недопустимо");
        }
        return (double) a / b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
}