package viikko03.taulukot;

public class TaulukkoValmiillaArvoilla {

    public static void main(String[] args) {

        String[] viikonpaivat = { "ma", "ti", "ke", "to", "pe", "la", "su" };

        int keskiviikko = 2;
        System.out.println(viikonpaivat[keskiviikko]);

        System.out.println("Taulukon pituus: " + viikonpaivat.length);

        for (int i = 0; i < viikonpaivat.length; i++) {
            System.out.println(viikonpaivat[i].toUpperCase());
        }
    }
}
