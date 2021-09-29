package viikko05.oliot.kaupungitV2;

public class Kaupunki {

    private String nimi;
    private int vakiluku;
    private double pintaAla;

    public Kaupunki(String nimi, int vakiluku, double pintaAla) {
        this.nimi = nimi;
        this.vakiluku = vakiluku;
        this.pintaAla = pintaAla;
    }

    public String getNimi() {
        return this.nimi;
    }

    public void setNimi(String uusiNimi) {
        this.nimi = uusiNimi;
    }

    public void setVakiluku(int uusiVakiluku) {
        if (uusiVakiluku >= 0) {
            this.vakiluku = uusiVakiluku;
        } else {
            throw new IllegalArgumentException("Väkiluku ei saa olla negatiivinen");
        }
    }

    public double laskeVaestontiheys() {
        return this.vakiluku / this.pintaAla;
    }

    public boolean vakilukuSuurempiKuin(Kaupunki toinen) {
        return this.vakiluku > toinen.vakiluku;
    }

    @Override
    public String toString() {
        return this.nimi + " (asukkaita: " + this.vakiluku + ", pinta-ala: " + this.pintaAla + ")";
    }
}
