package viikko02.toisto;

import java.time.LocalDate;

public class MenneetVuodet {

    public static void main(String[] args) {
        LocalDate nykyhetki = LocalDate.now();

        int vuosiluku = 1990; // alustus
        int nykyinenVuosiluku = nykyhetki.getYear();

        // toistoehto
        while (vuosiluku < nykyinenVuosiluku) {
            System.out.println(vuosiluku + " on historiaa");

            vuosiluku++; // kasvatus (sama kuin: vuosiluku = vuosiluku + 1)
        }
    }
}
