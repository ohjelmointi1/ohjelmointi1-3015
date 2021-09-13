package viikko03.taulukot;

import java.io.File;
import java.util.Scanner;

public class Tiedostolistaus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä hakemiston polku: ");
        String polku = lukija.nextLine();

        File nykyinenHakemisto = new File(polku);

        String[] listaus = nykyinenHakemisto.list();

        System.out.println(); // tyhjä rivinvaihto

        System.out.println("Hakemiston sisältö:");

        // taulukon merkkijonot yksi kerrallaan:
        for (int i = 0; i < listaus.length; i++) {
            String tiedosto = listaus[i];
            System.out.println(" " + tiedosto);
        }
    }
}
