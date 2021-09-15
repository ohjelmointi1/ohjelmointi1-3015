package viikko04.aika;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class KinkunPaistoaika {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä paistettavan kinkun paino (kg): ");
        double paino = lukija.nextDouble();

        double paistoaikaMinimi = paino * 1.0; // tuntia
        double paistoaikaMaksimi = paino * 1.5; // tuntia

        LocalDateTime aloitushetki = LocalDateTime.now();
        LocalDateTime lopetushetki = aloitushetki.plusMinutes((long) (60 * paistoaikaMaksimi));

        System.out.println("Paistoaika " + paistoaikaMinimi + " - " + paistoaikaMaksimi + " tuntia");

        if (lopetushetki.toLocalDate().equals(aloitushetki.toLocalDate())) {
            // jos saman vuorokauden puolella, tulostetaan vain kellonaika
            DateTimeFormatter kelloMuotoilu = DateTimeFormatter.ofPattern("HH:mm");
            String muotoiltu = kelloMuotoilu.format(lopetushetki);
            System.out.println("Ota pois uunista viimeistään " + muotoiltu);
        } else {
            // jos myöhemmin, tulosta myös päivämäärä
            DateTimeFormatter pitkaMuotoilu = DateTimeFormatter.ofPattern("d.M.yyyy HH:mm");
            String muotoiltu = pitkaMuotoilu.format(lopetushetki);
            System.out.println("Ota pois uunista viimeistään " + muotoiltu);
        }

    }
}
