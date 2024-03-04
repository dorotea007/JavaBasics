package at.tea.example.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        RootCalculator rootCalculator = new RootCalculator();

        System.out.println("Calculator: ");
        System.out.println("2 + 3 = " + calculator.add(2, 3));
        System.out.println("10 - 3 = " + calculator.subtract(10, 3));
        System.out.println("2 * 4 = " + calculator.multiply(2, 4));
        System.out.println("11 / 2 = " + calculator.divide(11, 2));

        printSpace();

        System.out.println("ScientificCalculator");
        System.out.println("Sinus: " + scientificCalculator.sin(Math.PI / 2));
        System.out.println("Cosinus: " + scientificCalculator.cos(Math.PI));
        System.out.println("Addition= " + calculator.add(10, 12));

        printSpace();

        System.out.println("RootCalculator");
        System.out.println("Wurzel: " + rootCalculator.squareRoot(25));
        System.out.println("Subtraction: " + calculator.subtract(20, 14));
    }

    public static void printSpace() {
        System.out.println("");
    }
}
