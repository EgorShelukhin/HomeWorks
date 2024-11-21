package homeWork1.t1;

public class Task4 {

    public static void main(String[] args) {
        int number = 6; // число для которого будет выводиться таблица умножения
        int lastMultiplier = 10; // число которое будет последней в нашем выводе
        int interation = 0; // Итерация в цикле while

        while (interation != lastMultiplier) {
            interation++;// Прибавляем 1 так как первый множитель в таблице должен быть 1
            String result = String.valueOf(number * interation);
            System.out.println(number + " x " + interation + " = " + result);
        }
    }

    // ВТОРОЙ ВАРИАНТ КАК РЕШИТЬ ДАННУЮ ЗАДАЧУ  (На будущее)
    public static void var2() { // Конкатенацию строк лучше делать с помощью string builder так что этот вариант на мой взгляд чуть лучше
        int number = 6; // число для которого будет выводиться таблица умножения
        int lastMultiplier = 10; // число которое будет последней в нашем выводе
        int interation = 0; // Итерация в цикле while
        StringBuilder sb = new StringBuilder(); // Создаем объект stringBuilder

        while (interation != lastMultiplier) {
            interation++;// Прибавляем 1 так как первый множитель в таблице должен быть 1
            sb
                    .append(number) // нашей начальное число
                    .append(" x ") // Знак умножения с пробелами
                    .append(interation) // итерация (на 1 ом кругу цикла = 1 так как начинаем с одного. На каждом последующем +1)
                    .append(" = ") // Знак равно с пробелами
                    .append(number * interation); // произведение 2-ух чисел
            System.out.println(sb); // чтобы объект StringBuilder певратить в класс String нужно вызвать метод sb.toSring ; Но в sout toString вызываеие автоматом
            sb.setLength(0); // отчищаем наш sb после вывода (чтобы из него изчезла наша старая строка и мы на следующем круге начнем наполнять его новой)
        }
    }
}
