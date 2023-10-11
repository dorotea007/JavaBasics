package at.tea.exercise;

import java.util.Scanner;

public class Bankomat1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bankBalance = 1000.0;

        while (true) {
            // Bankomat Menü anzeigen
            System.out.println("Bankautomat-Simulator");
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand abfragen");
            System.out.println("4. Beenden");
            System.out.print("Bitte wählen Sie eine Option (1/2/3/4): ");


            // Benutzereingabe lesen
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Einzahlen
                    System.out.print("Betrag zum Einzahlen eingeben: ");
                    double depositAmount = scanner.nextDouble();
                    bankBalance += depositAmount;
                    System.out.println("Einzahlung erfolgreich.");
                    break;
                case 2:
                    // Abheben
                    System.out.print("Betrag zum Abheben eingeben: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount <= bankBalance) {
                        bankBalance -= withdrawAmount;
                        System.out.println("Abhebung erfolgreich.");
                    } else {
                        System.out.println("Nicht genügend Geld auf dem Konto.");
                    }
                    break;
                case 3:
                    // Kontostand abfragen
                    System.out.println("Kontostand: " + bankBalance + " Euro");
                    break;
                case 4:
                    // Beenden
                    System.out.println("Vielen Dank für die Nutzung des Bankautomaten. Auf Wiedersehen!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Ungültige Option. Bitte wählen Sie erneut.");
                    break;
            }
        }
    }
}
