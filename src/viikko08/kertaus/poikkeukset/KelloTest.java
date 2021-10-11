package viikko08.kertaus.poikkeukset;

public class KelloTest {

    public static void main(String[] args) {

        Kello kello = new Kello(22, 12);
        System.out.println(kello);

        kello.lisaaMinuutit(180);
        System.out.println(kello);

        kello.setTunnit(-1); // poikkeus
        kello.setMinuutit(300); // poikkeus

        System.out.println(kello);
    }
}
