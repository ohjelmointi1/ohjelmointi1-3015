package viikko04.metodit;

import java.text.DecimalFormat;
import java.util.Scanner;

import arviointi.OsasuoritustenArviointi;

public class ViopeArvosananLaskeminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int viopeMaksimi = 65;

        System.out.print("Syötä Viope-pisteesi: ");
        int omatPisteet = lukija.nextInt();

        double arvosana = OsasuoritustenArviointi.laskeArvosana(omatPisteet, viopeMaksimi);

        DecimalFormat muotoilu = new DecimalFormat("0.00");
        System.out.println("Arvosana: " + muotoilu.format(arvosana));
    }
}
