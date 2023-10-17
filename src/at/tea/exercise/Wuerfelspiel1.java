package at.tea.exercise;

import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Willkommen beim Würfelspiel:)");
        boolean isPlaying = true;
        int playerScore = 0;
        int computerScore = 0;

        while (isPlaying) {
            int selection = getSelection();
            System.out.println("Selection: " + selection);

            if (selection == 1) {
                int sumPlayer = getSumOfRolledNumbers();
                int sumComputer = getSumOfRolledNumbers();

                System.out.println("Gewürfelte Zahl des Spielers: " + sumPlayer);
                System.out.println("Gewürfelte Zahl des Computers: " + sumComputer);

                if (sumPlayer > sumComputer) {
                    System.out.println("Du gewinnst:)");
                    playerScore++;
                } else if (sumPlayer < sumComputer) {
                    System.out.println("Der Computer gewinnt:(");
                    computerScore++;
                } else {
                    System.out.println("Unentschieden!");
                }

                System.out.println("Aktueller Punktestand:");
                System.out.println("Spieler: " + playerScore);
                System.out.println("Computer: " + computerScore);
            }

            if (selection == 2) {
                isPlaying = false;
                System.out.println("Vielen Dank fürs Spielen. Das Spiel wurde beendet.");
            }
        }
    }

    private static int getSumOfRolledNumbers() {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            int rolledNumber = random.nextInt(6) + 1;
            sum += rolledNumber;
        }
        return sum;
    }

    private static int getSelection() {
        System.out.println("Wähle eine Option:");
        System.out.println("1. Spiel starten");
        System.out.println("2. Spiel beenden");
        System.out.print("Deine Auswahl: ");
        return scanner.nextInt();
    }
}
