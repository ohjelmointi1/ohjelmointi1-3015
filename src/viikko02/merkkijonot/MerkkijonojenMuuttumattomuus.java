package viikko02.merkkijonot;

public class MerkkijonojenMuuttumattomuus {

    public static void main(String[] args) {
        String merkkijono = " Muurahainen ";

        System.out.println(merkkijono.toUpperCase());
        System.out.println(merkkijono); // alkuperäinen on muuttumaton!

        System.out.println(merkkijono.toLowerCase());
        System.out.println(merkkijono);

        // merkkijonon "muuttaminen" tehdään korvaamalla muuttujassa oleva arvo
        merkkijono = merkkijono.toUpperCase();

        System.out.println(merkkijono);

        System.out.println(merkkijono.trim());
    }
}
