package viikko04.metodit;

public class KestoSekunteina {

    public static void main(String[] args) {
        // FIXME: kysy nämä käyttäjältä Scannerin ja System.out'in avulla!
        int tunnit = 15;
        int minuutit = 9;
        int sekunnit = 4;

        int kesto = kestoSekunteina(tunnit, minuutit, sekunnit);

        System.out.println("Yhteensä " + kesto + " sekuntia.");
    }

    private static int kestoSekunteina(int h, int min, int sek) {
        int tulos = (h * 60 * 60) + (min * 60) + sek;
        return tulos;
    }
}
