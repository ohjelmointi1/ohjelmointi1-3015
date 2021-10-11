package viikko08.kertaus.oliot;

import java.util.ArrayList;

public class Playlist {

    private ArrayList<Song> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public Song getSong(int index) {
        if (index >= 0 && index < this.songs.size()) {
            return this.songs.get(index);
        } else {
            return null; // palautetaan tyhjä viittaus
        }
    }

    public int getTotalLength() {
        int lengthSum = 0;
        for (int i = 0; i < this.songs.size(); i++) {
            Song song = this.getSong(i);
            int currentLength = song.getLength();
            lengthSum += currentLength;
        }
        return lengthSum;
    }

    @Override
    public String toString() {
        String playlistStr = "";
        for (int i = 0; i < this.songs.size(); i++) {
            Song song = this.getSong(i);
            String songString = song.toString();
            playlistStr += (i + 1) + ": " + songString + "\n";
        }
        return playlistStr;
    }
}
