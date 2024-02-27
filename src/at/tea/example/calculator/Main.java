package at.tea.example.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ScientificCalculator scientificCalculator= new ScientificCalculator();
        RootCalculator rootCalculator = new RootCalculator();

        System.out.println("Calculator:");
        System.out.println("2 + 3 = " + calculator.add(2, 3));
        System.out.println("8 - 3 = " + calculator.subtract(5, 3));
        System.out.println("2 * 7 = " + calculator.multiply(2, 4));
        System.out.println("12 / 2 = " + calculator.divide(10, 2));


    }
}
