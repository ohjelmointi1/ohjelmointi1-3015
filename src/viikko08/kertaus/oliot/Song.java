package viikko08.kertaus.oliot;

public class Song {

    private int length;
    private String title;

    public Song(String title, int length) {
        this.length = length;
        this.title = title;
    }

    public int getLength() {
        return this.length;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return this.title + " by unknown artist";
    }
}
