package viikko03.taulukot;

import java.util.Arrays;

public class MerkkijonojenSplit {

    public static void main(String[] args) {
        String nykyhetki = "2021-10-13T11:21:00";
        String[] pvmJaKello = nykyhetki.split("T");

        System.out.println(pvmJaKello.length);

        String pvm = pvmJaKello[0];
        String kello = pvmJaKello[1];

        String[] vuosiKkPv = pvm.split("-");
        String[] hhMinSek = kello.split(":");

        System.out.println(Arrays.toString(vuosiKkPv));
        System.out.println(Arrays.toString(hhMinSek));

        int vuosi = Integer.parseInt(vuosiKkPv[0]);
        System.out.println("Seuraava vuosi " + (vuosi + 1));
        int kk = Integer.parseInt(vuosiKkPv[1]);
        int paiva = Integer.parseInt(vuosiKkPv[2]);

        System.out.println(paiva + "." + kk + "." + vuosi);
    }
}
