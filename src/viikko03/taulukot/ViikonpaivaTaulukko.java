package viikko03.taulukot;

import java.time.LocalDate;
import java.util.Arrays;

public class ViikonpaivaTaulukko {

    public static void main(String[] args) {

        String[] viikonpaivat = new String[7];

        // 1. taulukko voidaan täyttää epäjärjestyksessä.
        // 2. taulukkoon lisääminen ei siirrä seuraavia arvoja eteenpäin!
        viikonpaivat[6] = "sunnuntai";
        viikonpaivat[1] = "tiistai";
        viikonpaivat[5] = "lauantai";
        viikonpaivat[2] = "keskiviikko";
        viikonpaivat[0] = "maanantai";
        viikonpaivat[3] = "torstai";
        viikonpaivat[4] = "perjantai";

        String taulukkoMerkkijonona = Arrays.toString(viikonpaivat);
        System.out.println(taulukkoMerkkijonona);

        // arvon "lisääminen" korvaa aikaisemman arvon:
        viikonpaivat[2] = "pikkulauantai";

        System.out.println(Arrays.toString(viikonpaivat));

        LocalDate tanaan = LocalDate.now();
        int nykyisenViikonpaivanIndeksi = tanaan.getDayOfWeek().getValue() - 1;

        // Tulostetaan suomenkielinen päivä
        System.out.println("Tänään on " + viikonpaivat[nykyisenViikonpaivanIndeksi] + " 💃");

    }
}
