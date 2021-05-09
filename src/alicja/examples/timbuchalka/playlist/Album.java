package alicja.examples.timbuchalka.playlist;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> listSongs;

    public Album(ArrayList<Song> listSongs, String name) {
        this.listSongs = listSongs;
        this.name=name;
    }

    public ArrayList<Song> getListSongs() {
        return listSongs;
    }

    public void setListSongs(ArrayList<Song> listSongs) {
        this.listSongs = listSongs;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", listSongs=" + listSongs +
                '}';
    }
}
