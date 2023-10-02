package at.tea.units;

public class Loops2 {
    //Zähle die geraden Ziffern zwischen 1 und 1000 zusammen -
    // Tip: Starte den Loop bei 2 und erhöhe den Zählindex jeweils um 2.

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 2; i <= 1000; i += 2) {
            sum += i;
        }
        System.out.println("Die Summe der geraden Zahlen zwischen 1 und 1000 beträgt: " + sum);
    }

}
