package viikko04.metodit;

import arviointi.OsasuoritustenArviointi;

public class ViopeArvosanaAsteikko {

    public static void main(String[] args) {
        // Ei kysytä käyttäjältä mitään, vaan tulostetaan kaikki mahdolliset pistemäärät
        // ja niiden arvosanat.
        int viopenMaksimi = 65;

        System.out.println("pisteet,arvosana,pyoristetty");
        for (int pisteet = 0; pisteet <= viopenMaksimi; pisteet++) {
            double arvosana = OsasuoritustenArviointi.laskeArvosana(pisteet, viopenMaksimi);
            double pyoristetty = Math.round(arvosana);
            System.out.println(pisteet + "," + arvosana + "," + pyoristetty);
        }
    }
}
