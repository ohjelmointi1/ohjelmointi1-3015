package viikko05.oliot.oliotlistoilla;

public class Tuote {

    private String nimi;
    private double hinta;
    private String myyja;

    public Tuote(String nimi, double hinta, String myyja) {
        this.nimi = nimi;
        this.hinta = hinta;
        this.myyja = myyja;
    }

    public void alennaHintaa(double alennus) {
        this.hinta = this.hinta - alennus;

        if (this.hinta < 0) {
            this.hinta = 0;
        }
    }

    public void setNimi(String uusiNimi) {
        this.nimi = uusiNimi;
    }

    public String getNimi() {
        return this.nimi;
    }

    public double getHinta() {
        return this.hinta;
    }

    public String getMyyja() {
        return this.myyja;
    }

    @Override
    public String toString() {
        return this.nimi + "\n- hinta: " + this.hinta + " euroa\n- myyjä: " + this.myyja;
    }
}
