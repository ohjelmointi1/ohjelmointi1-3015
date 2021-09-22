package viikko05.oliot.oliotlistoilla;

import java.util.ArrayList;
import java.util.List;

public class Nettikirppis {

    public static void main(String[] args) {
        Tuote lipasto = new Tuote("Mäntylipasto", 390.0, "Monopoli Kaluste");
        Tuote jyrsin = new Tuote("Kantojyrsin", 1_390.0, "Tavaratukku");
        Tuote renkaat = new Tuote("Talvirenkaat", 390.0, "Haaga-Helia AMK");

        lipasto.alennaHintaa(200);

        List<Tuote> tuotteet = new ArrayList<Tuote>();
        tuotteet.add(lipasto);
        tuotteet.add(jyrsin);
        tuotteet.add(renkaat);

        // 1. Mäntylipasto
        // 2. Kantojyrsin
        // 3. Talvirenkaat...
        for (int i = 0; i < tuotteet.size(); i++) {
            Tuote tuote = tuotteet.get(i);
            System.out.println((i + 1) + ". " + tuote.toString() + "\n");
        }

        // lasketaan tuotteiden yhteishinta
        double yhteishinta = laskeYhteishinta(tuotteet);
        System.out.println("Yhteensä " + yhteishinta + " euroa");
    }

    private static double laskeYhteishinta(List<Tuote> tuotteet) {
        double summa = 0;
        for (int i = 0; i < tuotteet.size(); i++) {
            Tuote t = tuotteet.get(i);
            summa += t.getHinta();
        }
        return summa;
    }
}
