package at.tea.exercise;

import java.util.Scanner;

public class Bankomat1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kontostand = 1000.0;

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

        }
    }
}