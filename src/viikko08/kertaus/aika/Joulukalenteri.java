package viikko08.kertaus.aika;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Joulukalenteri {

    public static void main(String[] args) {
        LocalDate tanaan = LocalDate.now();
        LocalDate joulu = LocalDate.of(tanaan.getYear(), 12, 24);

        System.out.println(tanaan);
        System.out.println(joulu);

        if (tanaan.equals(joulu)) {
            System.out.println("Hyvää joulua!");
        } else if (tanaan.isAfter(joulu)) {
            System.out.println("Joulu meni jo....");
        } else {
            long paivia = ChronoUnit.DAYS.between(tanaan, joulu);
            System.out.println("Jouluun on " + paivia + " päivää");
        }
    }
}
