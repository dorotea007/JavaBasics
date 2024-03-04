package at.tea.example.calculator;

public class RootCalculator extends Calculator {
    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Square root of negative number is not defined");
        }
        return Math.sqrt(number);
    }
}
