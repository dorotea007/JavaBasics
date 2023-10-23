package at.tea.exercise;
import java.util.Random;
import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {

        String[] woerter = {"dorotea", "htldornbirn"};
        Random random = new Random();
        String zufallsWort = woerter[random.nextInt(woerter.length)];
        char[] ergebnis = new char[zufallsWort.length()];

        {
            int i = 0;
            while (i < ergebnis.length) {
                ergebnis[i] = '*';
                i++;
            }
        }

        Scanner scanner = new Scanner(System.in);
        int versuche = 0;

        System.out.println("Willkommen zum Worträtsel-Spiel!");
        while (true) {
            System.out.println("Aktuelles Wort: " + String.valueOf(ergebnis));
            System.out.print("Geben Sie einen Buchstaben ein: ");
            char buchstabe = scanner.next().charAt(0);

            boolean buchstabeGefunden = false;
            for (int i = 0; i < zufallsWort.length(); i++) {
                if (zufallsWort.charAt(i) == buchstabe) {
                    ergebnis[i] = buchstabe;
                    buchstabeGefunden = true;
                }
            }

            if (!buchstabeGefunden) {
                System.out.println("Falscher Buchstabe!");
                versuche++;
            }

            if (String.valueOf(ergebnis).equals(zufallsWort)) {
                System.out.println("Herzlichen Glückwunsch! Sie haben das Wort erraten: " + zufallsWort);
                break;
            }
        }

        System.out.println("Spiel beendet. Sie haben " + versuche + " Versuche gebraucht.");
        scanner.close();
    }
}
