package viikko08.kertaus.poikkeukset;

public class Kello {

    private int tunnit;
    private int minuutit;

    public Kello(int h, int min) {
        this.setTunnit(h);
        this.setMinuutit(min);
    }

    public void setTunnit(int h) {
        if (h < 0 || h > 23) {
            // Virheellinen arvo!
            throw new IllegalArgumentException("Virheellinen kellonaika");
        }
        this.tunnit = h;
    }

    public int getTunnit() {
        return this.tunnit;
    }

    public int getMinuutit() {
        return this.minuutit;
    }

    public void setMinuutit(int min) {
        if (min < 0 || min >= 60) {
            // Virheellinen arvo!
            throw new IllegalArgumentException("Virheellinen kellonaika");
        }
        this.minuutit = min;
    }

    public void lisaaMinuutit(int mins) {
        this.minuutit += mins; // saattaa mennä yli 60:n!!!

        if (this.minuutit > 60) {
            // esim. 192 / 60 = 3
            int tunnitYlittyyKertaa = this.minuutit / 60;

            this.tunnit += tunnitYlittyyKertaa;
            this.minuutit = this.minuutit - 60 * tunnitYlittyyKertaa;
        }

        if (this.tunnit >= 24) {
            this.tunnit = this.tunnit % 24;
        }
    }

    @Override
    public String toString() {
        if (this.minuutit < 10) {
            return this.tunnit + ":0" + this.minuutit;
        } else {
            return this.tunnit + ":" + this.minuutit;
        }
    }
}
