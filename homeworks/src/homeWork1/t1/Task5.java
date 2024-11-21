package homeWork1.t1;

public class Task5 {
    public static void main(String[] args) {
        int lastOlympicDay = 2024; // Год до которого считаем
        int olympicDay = 1980; // Год с которого начинаем считаеть

        while (olympicDay <= lastOlympicDay) {
            System.out.println(" Олимпиада " + olympicDay);
            olympicDay += 4; // увеличиваем olympicDay на 4 на каждой итерации
        }
    }
}
