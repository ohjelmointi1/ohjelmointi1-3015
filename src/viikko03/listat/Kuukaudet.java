package viikko03.listat;

import java.util.ArrayList;
import java.util.List;

public class Kuukaudet {

    public static void main(String[] args) {
        List<String> kuukaudet = new ArrayList<>();
        kuukaudet.add("Tammikuu");
        kuukaudet.add("Helmikuu");
        kuukaudet.add("Maaliskuu");
        kuukaudet.add("...");

        // Tämä korvaa aikaisemman listan kokonaan!
        // Tämä ei toimisi, jos kuukaudet olisi määritelty ArrayListiksi
        kuukaudet = List.of("Tammikuu", "Helmikuu", "Maaliskuu", "Huhtikuu", "Toukokuu", "...");

        System.out.println(kuukaudet);

        int pituus = kuukaudet.size();
        System.out.println(pituus);

        System.out.println("\nPerinteinen for:");
        for (int i = 0; i < pituus; i++) {
            String nimi = kuukaudet.get(i);
            System.out.println(nimi);
        }

        System.out.println("\nFor-each:");
        // enhanced for loop tai for-each loop
        for (String nimi : kuukaudet) {
            System.out.println(nimi);
        }
    }
}
