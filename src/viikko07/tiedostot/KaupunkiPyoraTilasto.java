package viikko07.tiedostot;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Tämä tuntiesimerkki hyödyntää "Helsingin ja Espoon kaupunkipyörillä ajetut
 * matkat" -tietoaineistoa, joka on saatavissa osoitteesta:
 * https://www.avoindata.fi/data/fi/dataset/helsingin-ja-espoon-kaupunkipyorilla-ajatut-matkat
 * 
 * Koodin kokeilemiseksi tallenna itsellesi heinäkuun 2020 aineisto osoitteesta
 * https://dev.hsl.fi/citybikes/od-trips-2020/2020-07.csv, ja siirrä se
 * Java-projektin juurihakemistoon nimellä kaupunkipyorat-2020-07.csv.
 * 
 * Datan omistaa City Bike Finland ja sen lisenssi on CC-BY-4.0
 */
public class KaupunkiPyoraTilasto {

    public static void main(String[] args) {
        String tiedosto = "kaupunkipyorat-2020-07.csv";
        Path polkuTiedostoon = Paths.get(tiedosto);
        System.out.println("Käytetään tiedostoa: " + polkuTiedostoon.toAbsolutePath() + "\n");

        try {
            List<String> rivit = Files.readAllLines(polkuTiedostoon, StandardCharsets.UTF_8);

            String otsikkorivi = rivit.get(0);
            List<String> matkat = rivit.subList(1, rivit.size());

            double pituuksienSumma = 0;
            int kestojenSumma = 0;
            double suurinKeskinopeus = 0;
            String suurinKeskinopeusMatka = "";

            for (String matka : matkat) {
                String[] osat = matka.split(",");
                double pituus = Double.parseDouble(osat[osat.length - 2]);
                int kesto = Integer.parseInt(osat[osat.length - 1]);
                double keskinopeus = pituus / kesto;

                pituuksienSumma += pituus;
                kestojenSumma += kesto;

                if (keskinopeus > suurinKeskinopeus) {
                    suurinKeskinopeus = keskinopeus;
                    suurinKeskinopeusMatka = matka;
                }
            }

            System.out.println("Matkoja yhteensä: " + matkat.size());

            System.out.println("Kaikkien matkojen pituus yhteensä: " + pituuksienSumma / 1_000 + " km");
            System.out.println("Kaikkien matkojen kesto yhteensä: " + kestojenSumma / 60 / 60 + " tuntia");

            double keskimaarainenNopeus = pituuksienSumma / kestojenSumma;
            System.out.println("Keskimääräinen nopeus: " + muunnaKilometreiksiTunnissa(keskimaarainenNopeus) + " km/h");
            System.out.println("Nopein yksittäinen matka: " + muunnaKilometreiksiTunnissa(suurinKeskinopeus) + " km/h");

            System.out.println();
            System.out.println("Suurimman keskinopeuden rivi: " + suurinKeskinopeusMatka);

        } catch (IOException tiedostoPoikkeus) {
            System.out.println("Tiedoston lukeminen epäonnistui: " + tiedostoPoikkeus.getMessage());
        }
    }

    private static double muunnaKilometreiksiTunnissa(double metritSekunnissa) {
        return metritSekunnissa * 60 * 60 / 1_000;
    }
}
