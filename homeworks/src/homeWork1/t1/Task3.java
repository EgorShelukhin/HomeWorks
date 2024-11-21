package homeWork1.t1;

public class Task3 {
    public static void main(String[] args) {
        int number = 6; // число для которого будет выводиться таблица умножения
        int lastMultiplier = 10; // число которое будет последней в нашем выводе

        for (int i = 1; i <= lastMultiplier; i++) {
            String result = String.valueOf(number * i);
            System.out.println(number + " x " + i + " = " + result);
        }
    }

    // ВТОРОЙ ВАРИАНТ КАК РЕШИТЬ ДАННУЮ ЗАДАЧУ  (На будущее)
    public static void var2() { // Конкатенацию строк лучше делать с помощью string builder так что этот вариант на мой взгляд чуть лучше
        int number = 6; // число для которого будет выводиться таблица умножения
        int lastMultiplier = 10; // число которое будет последней в нашем выводе
        StringBuilder sb = new StringBuilder(); // Создаем объект stringBuilder

        for (int i = 1; i <= lastMultiplier; i++) {
            sb
                    .append(number) // нашей начальное число
                    .append(" x ") // Знак умножения с пробелами
                    .append(i) // итерация (на 1 ом кругу цикла = 1 так как начинаем с одного. На каждом последующем +1)
                    .append(" = ") // Знак равно с пробелами
                    .append(number * i); // произведение 2-ух чисел
            System.out.println(sb); // чтобы объект StringBuilder певратить в класс String нужно вызвать метод sb.toSring ; Но в sout toString вызываеие автоматом
            sb.setLength(0); // отчищаем наш sb после вывода (чтобы из него изчезла наша старая строка и мы на следующем круге начнем наполнять его новой)
        }
    }
}
