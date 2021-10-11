package viikko08.kertaus.merkkijonot;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tuotteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        DecimalFormat muotoilu = new DecimalFormat("0.00");
        /*
         * Anna tuotenumero: 1234
         * 
         * Anna tuotteen nimi: Porsche
         * 
         * Anna tuotteen hinta: 423000,00
         * 
         * Anna tuotteen kuvaus: Punainen
         */
        System.out.print("Anna tuotenumero: ");
        int tuotenumero = lukija.nextInt();

        lukija.nextLine(); // Consume newline left-over (https://stackoverflow.com/a/13102066)

        System.out.print("Anna tuotteen nimi: ");
        String tuotenimi = lukija.nextLine().trim().toUpperCase();

        System.out.print("Anna tuotteen hinta: ");
        double hinta = lukija.nextDouble();

        // tähän muut kysymykset... (kuvaus)

        System.out.println();
        System.out.println("Numero: " + tuotenumero);
        System.out.println("Nimi: " + tuotenimi);
        System.out.println("Hinta: " + muotoilu.format(hinta));
    }
}
