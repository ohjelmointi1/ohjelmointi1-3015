package viikko04.metodit;

import java.time.LocalTime;

public class TulostaKellonaika {

    public static void main(String[] args) {

        String aloitusaika = nykyinenKellonaika();
        System.out.println("Ohjelma alkaa " + aloitusaika + "...");

        tulostaKellonaika();

        // kysytään syötteitä ja tehdään laskentaa
        System.out.println("Ohjelma käynnissä");

        // halutaan tulostaa kellonaika uudelleen!
        tulostaKellonaika();

        System.out.println("Ohjelma päättyy " + nykyinenKellonaika() + "...");
    }

    private static void tulostaKellonaika() {
        String kello = nykyinenKellonaika();
        System.out.println(kello);
    }

    private static String nykyinenKellonaika() {
        LocalTime nyt = LocalTime.now();
        int minuutit = nyt.getMinute();
        if (minuutit < 10) {
            return nyt.getHour() + ":0" + minuutit;
        } else {
            return nyt.getHour() + ":" + minuutit;
        }
    }
}
