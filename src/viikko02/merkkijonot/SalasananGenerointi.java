package viikko02.merkkijonot;

import java.util.Random;

public class SalasananGenerointi {

    public static void main(String[] args) {
        String pienet = "abcdefghijklmnopqrstuvwxyzåäö";
        String isot = pienet.toUpperCase();
        String numerot = "0123456789";
        String erikoismerkit = "!\"#¤%&/()\\=@£$€{[]}";
        String kaikki = pienet + isot + numerot + erikoismerkit;

        String salasana = "";
        while (salasana.length() < 64) {
            Random satunnaisGeneraattori = new Random();
            int satunnaisluku = satunnaisGeneraattori.nextInt(kaikki.length());

            String satunnainen = kaikki.substring(satunnaisluku, satunnaisluku + 1);
            salasana = salasana + satunnainen;
        }

        System.out.println(salasana);
    }
}
