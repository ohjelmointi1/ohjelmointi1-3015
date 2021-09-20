package viikko04.aika;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Juhannus {

    public static void main(String[] args) {
        // TODO: kysy vuosiluku käyttäjältä!
        int vuosi = 2024;

        LocalDate juhannus = laskeJuhannus(vuosi);

        DateTimeFormatter muotoilija = DateTimeFormatter.ofPattern("d.M.yyyy");

        System.out.println(muotoilija.format(juhannus));
    }

    private static LocalDate laskeJuhannus(int vuosi) {
        // selvitetään kesäkuun 20. ja 26. päivän välinen lauantai!
        for (int paiva = 20; paiva <= 26; paiva++) {
            LocalDate paivaOlio = LocalDate.of(vuosi, 6, paiva);

            if (paivaOlio.getDayOfWeek() == DayOfWeek.SATURDAY) {
                return paivaOlio;
            }
        }
        return null;
    }
}
