package viikko01.ehtorakenteet; // poista tämä rivi Viopessa

import java.time.LocalTime; // poista tämä rivi Viopessa

public class Tervehdykset {

    public static void main(String[] args) {
        LocalTime nykyhetki = LocalTime.now();

        // Kutsutaan metodia ja otetaan vastaus talteen:
        int tunnit = nykyhetki.getHour();
        
        if (tunnit >= 8) {
            System.out.println("Hyvää päivää!");
        }
    }
}
