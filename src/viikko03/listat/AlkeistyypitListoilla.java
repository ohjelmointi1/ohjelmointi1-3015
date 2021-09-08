package viikko03.listat;

import java.util.ArrayList;
import java.util.List;

public class AlkeistyypitListoilla {

    public static void main(String[] args) {
        int a = 10;
        double b = 11.2;
        boolean tosi = true;

        List<Integer> numerot = new ArrayList<>();
        numerot.add(87);
        numerot.add(10);

        int eka = numerot.get(0);
        System.out.println(eka);
    }
}
