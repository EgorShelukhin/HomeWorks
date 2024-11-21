package homework2.Calculator;

public class PositiveNumberCalculator extends Calculator {

    @Override
    protected boolean validate(double a, double b, CalculatorOperationEnum operation) {
        if (a <= 0 || b <= 0) {
            System.out.println("Ошибка: оба числа должны быть больше 0.");
            return false;
        }
        return super.validate(a, b, operation); // Выполнить проверку на деление на ноль
    }

    @Override
    public double operationHandle(double a, double b, CalculatorOperationEnum operation) {
        checkPositive(a, b);  // Проверка на положительные числа
        return super.operationHandle(a, b, operation);  // Вызов метода родительского класса
    }

    private void checkPositive(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Числа должны быть больше 0.");
        }
    }
}
