package viikko03.listat;

import java.util.ArrayList;

public class FormulaKuskit {

    public static void main(String[] args) {

        // Huono tapa!
        String kuski1 = "Verstappen";
        String kuski2 = "Hamilton";
        String kuski3 = "Bottas";

        // Oikea tapa: käytä listaa:
        ArrayList<String> kuskit = new ArrayList<>();

        kuskit.add("Verstappen");
        kuskit.add("Hamilton");
        kuskit.add("Bottas");
        kuskit.add("Norris");

        // Indeksit alkavat aina nollasta!
        kuskit.add(0, "Rosberg");

        System.out.println(kuskit);

        int pituus = kuskit.size();
        System.out.println("Listan pituus: " + pituus);

        for (int i = 0; i < kuskit.size(); i++) {
            String kuskinNimi = kuskit.get(i);
            System.out.println((i + 1) + ". " + kuskinNimi);
        }

        boolean raikkonenLoytyy = kuskit.contains("Räikkönen");
        int indeksi = kuskit.indexOf("Räikkönen");

        if (raikkonenLoytyy) {
            System.out.println("Räikkönen löytyy!");
        } else {
            System.out.println("Räikkönen ei löydy!");
        }
        System.out.println("Räikkösen indeksi: " + indeksi);
    }
}
