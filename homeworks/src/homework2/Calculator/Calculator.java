package homework2.Calculator;

public class Calculator {
    /*  Это Класс-Метод который в зависимости от того какой CalculatorOperationEnum пришел вызывает нужный метод в классе.
        В самом начале метода вызовете метод validate и убедитесь что вам приходят корректные числа, если они не валидны сообщите об этому в sout и сделайте return
        (для этого класса - это проверка что на 0 делить нельзя, для класса наследника - что числа приходят больше 0)
     */
    public double operationHandle (double a, double b, CalculatorOperationEnum operation) {
        if (!validate(a, b, operation)) {
            return 0; // Завершить выполнение, если валидация не пройдена
        }
        switch (operation) {
            case PLUS:
                return a + b;
            case MINUS:
                return a - b;
            case DIVIDE:
                if (b == 0) {
                    throw new ArithmeticException("На ноль делить нельзя!");
                }
                return a / b;
            case MULTIPLY:
                return a * b;
            default:
                throw new IllegalArgumentException("Операция не поддерживается.");
        }
    }

    protected boolean validate(double a, double b, CalculatorOperationEnum operation) {
        if (operation == CalculatorOperationEnum.DIVIDE && b == 0) {
            System.out.println("Ошибка: деление на ноль невозможно.");
            return false; // Валидация не пройдена
        }
        return true; // Валидация пройдена
    }
    public void exceptionHandler(Exception e) {
        System.out.println("Произошла ошибка: " + e.getMessage());
    }
}