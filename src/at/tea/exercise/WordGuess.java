package at.tea.exercise;

import java.util.Random;
import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {

        String[] words = {"dorotea", "htldornbirn", "maturaball", "paradies", "schmetterling", "geheimnis"};
        Random random = new Random();
        String randomWord = words[random.nextInt(words.length)];
        char[] result = new char[randomWord.length()];

        {
            int i = 0;
            while (i < result.length) {
                result[i] = '*';
                i++;
            }
        }

        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int maxAttempts = 7; // Begrenzung der Versuche
        StringBuilder guessedLetters = new StringBuilder(); // geratene Buchstaben werden hier gespeichert

        System.out.println("Willkommen zum Worträtsel-Spiel!");
        while (attempts < maxAttempts) {
            System.out.println("Aktuelles Wort: " + String.valueOf(result));
            System.out.print("Bereits geratene Buchstaben: ");
            for (int j = 0; j < guessedLetters.length(); j++) {
                System.out.print(guessedLetters.charAt(j));
                if (j < guessedLetters.length() - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println();
            System.out.print("Geben Sie einen Buchstaben ein: ");
            char letter = scanner.next().charAt(0);

            if (guessedLetters.indexOf(String.valueOf(letter)) >= 0) {
                System.out.println("Sie haben diesen Buchstaben bereits geraten.");
                continue;
            }
            guessedLetters.append(letter);

            boolean foundLetter = false;
            for (int i = 0; i < randomWord.length(); i++) {
                if (randomWord.charAt(i) == letter) {
                    result[i] = letter;
                    foundLetter = true;
                }
            }

            if (!foundLetter) {
                System.out.println("Falscher Buchstabe!");
                attempts++;
            }

            if (String.valueOf(result).equals(randomWord)) {
                System.out.println("Herzlichen Glückwunsch! Sie haben das Wort erraten: " + randomWord);
                break;
            }
        }

        if (attempts >= maxAttempts) {
            System.out.println("Spiel beendet. SIe haben alle Versuche verbraucht. Das gesuchte Wort war " + randomWord);
        } else {
            System.out.println("Spiel beendet. Sie haben " + attempts + " Versuche gebraucht.");
            scanner.close();
        }
    }
}
