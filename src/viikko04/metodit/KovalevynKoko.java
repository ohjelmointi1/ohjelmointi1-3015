package viikko04.metodit;

import java.util.Scanner;

public class KovalevynKoko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Syötä kovalevyn koko gigatavuina: ");
        int gigatavut = lukija.nextInt();
        System.out.println();

        double osGigatavut = laskeLevynKoko(gigatavut);

        System.out.println("Koko valmistajan mukaan: " + gigatavut);
        System.out.println("Koko käyttöjärjestelmän mukaan: " + osGigatavut);
    }

    private static double laskeLevynKoko(int gigat) {
        long kilotavu = 1024L;
        long megatavu = 1024L * kilotavu;
        long gigatavu = 1024L * megatavu;

        return gigat * 1_000_000_000.0 / gigatavu;
    }
}
