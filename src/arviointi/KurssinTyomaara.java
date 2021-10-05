package arviointi;

public class KurssinTyomaara {

    public static void main(String[] args) {
        int kestoViikkoina = 8;
        int opintopisteita = 5;
        int tyomaaraPerPiste = 27;

        int kokonaistyomaara = opintopisteita * tyomaaraPerPiste;
        System.out.println(kokonaistyomaara); // 135 tuntia

        double tyomaaraPerViikko = 1.0 * kokonaistyomaara / kestoViikkoina;
        System.out.println(tyomaaraPerViikko); // 16.875 tuntia per viikko
    }
}
