package homework2.Calculator;



/* Реализовать методы класс Calculator , CalculatorUtils а также создать класс наследник класса Calculator - PositiveNumberCalculator
   который сможет работать только с числами больше 0

   В методе main запрашивать число a, число b, и операцию которую вы хотите с ними сделать,
   программа должна работать до тех пор, пока пользователь не введет ключевое слово "стоп"

   Типы операций вводимых пользователем нужно приводить к енаму CalculatorOperationEnum,
   а дальше передавать в метод класса Calculator operationHandler.
   (вся логика работы калькулятора происходит через метод handle)

   в методе мейн должна быть след логика -
   1. Сделать так, чтобы программа работала до ввода ключевого слова
   2. Запрашивать у пользователя число a, число b и операцию, которую нужно сделать с этими числами
   3. Считывать данные из пункта 2 через класс Scanner
   4. запускать передавать данные в метод operationHandler в классе Calculator

    если пользователь введет операцию которой не существует то произойдет исключение IllegalArgumentException, как его обработать смотрите ниже

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("Введите число a (или 'стоп' для выхода): ");
            String inputA = scanner.next();
            if (inputA.equalsIgnoreCase("стоп")) break;

            System.out.print("Введите число b (или 'стоп' для выхода): ");
            String inputB = scanner.next();
            if (inputB.equalsIgnoreCase("стоп")) break;

            System.out.print("Введите операцию (сложить, вычесть, разделить, умножить): ");
            String operationInput = scanner.next();
            if (operationInput.equalsIgnoreCase("стоп")) break;

            try {
                double a = Double.parseDouble(inputA);
                double b = Double.parseDouble(inputB);
                CalculatorOperationEnum operation = CalculatorOperationEnum.fromValue(operationInput);

                double result = calculator.operationHandle(a, b, operation);
                System.out.println("Результат: " + result);
            } catch (IllegalArgumentException e) {
            calculator.exceptionHandler(e);
        }

            System.out.println("Программа завершена.");
            scanner.close();
        }
    }
}