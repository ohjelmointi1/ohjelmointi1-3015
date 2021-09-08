package viikko03.listat;

import java.util.Scanner;

public class Rekkarit {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä rekisterinumero: ");
        String rekkari = lukija.nextLine().toUpperCase();

        if (rekkari.matches("[A-ZÅÄÖ]{1,3}-[0-9]{1,3}")) {
            System.out.println("Oikea rekkari!");
        } else {
            System.out.println("Virhe!");
        }
    }
}
