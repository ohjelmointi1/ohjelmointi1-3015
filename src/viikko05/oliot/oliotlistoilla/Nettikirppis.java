package viikko05.oliot.oliotlistoilla;

public class Nettikirppis {

    public static void main(String[] args) {
        Tuote lipasto = new Tuote("Kiteen Notte Lipasto", 390.0, "Metropoli Kaluste");

        // ....
        System.out.println(lipasto.getNimi());

        System.out.println(lipasto);
    }
}
