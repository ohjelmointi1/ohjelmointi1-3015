package viikko04.aika;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

// Tämä luokka laskee päivät jouluun
public class Joululaskuri {

    public static void main(String[] args) {
        LocalDate tanaan = LocalDate.now();
        LocalDate joulu = tanaan.withMonth(12).withDayOfMonth(24);

        System.out.println(tanaan);
        System.out.println(joulu);

        Period aikavali = Period.between(tanaan, joulu);
        System.out.println(aikavali.getMonths() + " kuukautta ja " + aikavali.getDays() + " päivää jouluun.");

        long paivatJouluun = ChronoUnit.DAYS.between(tanaan, joulu);
        System.out.println(paivatJouluun + " päivää jouluun.");
    }
}
