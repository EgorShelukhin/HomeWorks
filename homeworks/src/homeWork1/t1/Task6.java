package homeWork1.t1;

public class Task6 {

    public static void main(String[] args) {
        int lastOlympicDay = 2024; // Год до которого считаем
        int olympicDay = 1980; // Год с которого начинаем считаеть

        for (int i = olympicDay; i <= lastOlympicDay; i = i + 4) {
            System.out.println(" Олимпиада " + i);
        }
    }
}
