package at.tea.units;

public class Loops1 {
    //Zähle in einem For-Loop die Zahlen von 1 bis 100 (inklusive) zusammen
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("Die Summe der Zahlen von 1 bis 100 beträgt: " + sum);
    }

}
