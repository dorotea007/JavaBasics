package at.tea.units;

import java.util.Random;

public class While1 {
    public static void main(String[] args) {
        // Zufallsgenerator initialisieren
        Random random = new Random();

        int summe = 0;
        int randomnumber;

        while (true) {
            // Zufallszahl zwischen 10 und 30 generieren
            randomnumber = random.nextInt(21) + 10;

            // Zufallszahl zur Summe hinzufügen
            summe += randomnumber;

            // Ausgabe der Zufallszahl
            System.out.println("Zufallszahl: " + randomnumber);

            // Überprüfen, ob 15 oder 25 erreicht wurden
            if (randomnumber == 15 || randomnumber == 25) {
                break; // Schleife beenden
            }
        }

        // Ausgabe der Summe der vorherigen Zufallszahlen
        System.out.println("Summe der vorherigen Zufallszahlen: " + (summe - randomnumber));
    }
}
