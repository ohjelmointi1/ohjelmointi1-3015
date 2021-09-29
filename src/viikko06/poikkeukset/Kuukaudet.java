package viikko06.poikkeukset;

import java.util.Scanner;

public class Kuukaudet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        String[] kuukaudet = { "tammi", "helmi", "maalis", "huhti", "touko", "kesä", "heinä", "elo", "syys", "loka",
                "marras", "joulu" };

        // 29.9.2021 => 29. syyskuuta 2021
        System.out.print("Syötä päivämäärä: ");
        String paivamaara = lukija.nextLine();

        String[] osat = paivamaara.split("\\.");

        try {
            String paiva = osat[0];
            String kuukausi = osat[1];
            String vuosi = osat[2];

            String kuukaudenNimi = kuukaudet[Integer.parseInt(kuukausi) - 1];

            System.out.println(paiva + ". " + kuukaudenNimi + "kuuta " + vuosi);

        } catch (ArrayIndexOutOfBoundsException indeksiPoikkeus) {
            System.err.println("Syötit virheellisen päivämäärän: " + indeksiPoikkeus.getMessage());

        } catch (NumberFormatException numeroPoikkeus) {
            String poikkeusTeksti = numeroPoikkeus.getMessage();
            System.err.println("Virheellinen kuukauden numero: " + poikkeusTeksti);

        } finally {
            // finally-lohkossa tyypillisesti suljetaan avatut resurssit
            lukija.close();

        }

        System.out.println("Ohjelma ei kaatunut");
    }
}
