package Arithmetic;

public class Arithmetic<T extends Number> {
    private final T num1;
    private final T num2;

    public Arithmetic(T num1, T num2) {
        if (isNumber(num1) && isNumber(num2)) {
            this.num1 = num1;
            this.num2 = num2;
        } else {
            throw new IllegalArgumentException("Input is invalid. It should be a number type.");
        }
    }

    public boolean isNumber(T num) {
        return num instanceof Integer || num instanceof Double || num instanceof Float || num instanceof Short || num instanceof Long;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public double subtract() {
        return num1.doubleValue() - num2.doubleValue();
    }

    public double multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    public double divide() {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Cannot divide by zero goofy goober");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

    public double getMin() {
        return Math.min(num1.doubleValue(), num2.doubleValue());
    }

    public double getMax() {
        return Math.max(num1.doubleValue(), num2.doubleValue());
    }
}