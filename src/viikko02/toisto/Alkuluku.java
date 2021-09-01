package viikko02.toisto;

public class Alkuluku {

    public static void main(String[] args) {
        // TODO: muista lisätä Scanner lopussa
        int syote = 4;

        // yksisuuntainen lippu, muutetaan ainoastaan false'ksi,
        // ei koskaan takaisin true'ksi
        boolean onAlkuluku = true;

        // Etsitään, löytyykö lukua, jolla syöte olisi jaollinen
        for (int jakaja = 2; jakaja < syote; jakaja++) {
            int jakojaannos = syote % jakaja;

            if (jakojaannos == 0) {
                onAlkuluku = false;
            }
        }

        if (onAlkuluku) {
            System.out.println("Luku " + syote + " on alkuluku.");
        } else {
            System.out.println("Luku " + syote + " ei ole alkuluku.");
        }

    }
}
