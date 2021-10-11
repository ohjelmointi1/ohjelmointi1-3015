package viikko08.kertaus.oliot;

public class PlaylistTest {

    public static void main(String[] args) {
        Song s1 = new Song("Kappale 1", 120);
        Song s2 = new Song("Kappale 2", 180);

        Playlist playlist = new Playlist();

        playlist.addSong(s1);
        playlist.addSong(s2);
        playlist.addSong(new Song("Kappale 3", 10));

        System.out.println("Eka: " + playlist.getSong(0));
        System.out.println("Toka: " + playlist.getSong(1));
        System.out.println("Kolmas: " + playlist.getSong(2));

        System.out.println("Kesto: " + playlist.getTotalLength());

        System.out.println();

        System.out.println(playlist);
    }
}
