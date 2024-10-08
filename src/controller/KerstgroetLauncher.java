package controller;

import java.util.Scanner;

/* Dit programma toont een kerstgroet aan de gebruiker. Op basis van de selectie van de selectie van de gebruiker, laat het een bepaalde hoeveelheid kerstbomen zien.
 Met vriendelijke groet, Danny Kwant */
public class KerstgroetLauncher {

    //Functie welke de mooie kerstboom bevat die geprint gaat worden op het scherm van de gebruiker
    static void printKerstboom()
    {
        System.out.println(" ");
        System.out.println("    *   ");
        System.out.println("  * * * ");
        System.out.println("   * *  ");
        System.out.println(" * * * *");
        System.out.println("  * * * ");
        System.out.println("* * * * * ");
        System.out.println("    *   ");
    }

    public static void main(String[] args) {

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Gebruiker vragen hoeveel bomen ze willen zien
        System.out.println("Hoeveel kerstbomen wil je zien?");

        // Aantal bomen dat gebruiker wil zien schrijven naar int
        int scanboom = scanner.nextInt();

        System.out.println("Ho-ho-ho, Merry Christmas!");

        // For loop om de boom te blijven printen tot de gewenste hoeveelheid bereikt is van de gebruiker
        for (int i = 0; i < scanboom; i++) {
            printKerstboom();
        }

    }

}
