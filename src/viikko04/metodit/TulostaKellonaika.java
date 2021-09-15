package viikko04.metodit;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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
        DateTimeFormatter muotoilu = DateTimeFormatter.ofPattern("HH:mm");
        return muotoilu.format(LocalTime.now());
    }
}
