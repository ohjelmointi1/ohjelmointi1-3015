package viikko03.listat;

import java.util.ArrayList;
import java.util.List;

public class ListoihinViittaaminen {

    public static void main(String[] args) {
        // lista naisten etunimiä
        List<String> naiset = new ArrayList<>();
        naiset.add("Tuula");
        naiset.add("Anne");
        naiset.add("Päivi");
        naiset.add("Anna");

        // lista miesten etunimiä
        List<String> miehet = new ArrayList<>();
        miehet.add("Juha");
        miehet.add("Timo");
        miehet.add("Matti");
        miehet.add("Kari");

        System.out.println(naiset);
        System.out.println(miehet);

        List<String> molemmat = new ArrayList<>();
        molemmat.addAll(naiset);
        molemmat.addAll(miehet);

        System.out.println("Molemmat: " + molemmat);
        System.out.println("Naiset: " + naiset);
        System.out.println("Miehet: " + miehet);

    }
}
