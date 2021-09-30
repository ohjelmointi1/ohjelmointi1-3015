package viikko01.perusteet;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Maalaus {
    /*
     * Esimerkiksi huoneen leveys on 3.2 metriä, pituus on 3.0 metriä ja korkeus 2.5
     * metriä. Litralla maalia saadaan maalattua 7.0 neliötä. Maalia tarvitaan koko
     * huoneen maalaamiseen 4.43 l ((leveys + leveys + pituus + pituus) * korkeus /
     * litralla).
     */

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna huoneen leveys, pituus ja korkeus: ");
        double leveys = lukija.nextDouble();
        double pituus = lukija.nextDouble();
        double korkeus = lukija.nextDouble();

        System.out.print("Paljonko litralla saadaan maalattua neliöitä: ");
        double neliotLitralla = lukija.nextDouble();

        double seina1 = leveys * korkeus;
        double seina2 = pituus * korkeus;

        double kokonaisAla = seina1 * 2 + seina2 * 2;

        DecimalFormat kaksiDesimaalia = new DecimalFormat("0.00");

        double maalinKulutus = kokonaisAla / neliotLitralla;
        String muotoiltu = kaksiDesimaalia.format(maalinKulutus);

        System.out.println("Maalin tarve on " + muotoiltu + " litraa");
        
        System.out.println("Tarvitset " + Math.ceil(maalinKulutus / 2.7) + " kpl 2,7 litran maalipurkkeja.");
    }
}
