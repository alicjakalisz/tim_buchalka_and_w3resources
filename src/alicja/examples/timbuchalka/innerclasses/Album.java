package alicja.examples.timbuchalka.innerclasses;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by dev on 18/09/15.
 */
public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = songs.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

     class ClassB {

     }

    private class SongList {
        private ArrayList<Song> songList;

        public SongList(){
            this.songList=new ArrayList<>();
        }

        private boolean add(Song song){
            return songList.add(song);
        }

        private Song findSong(int track){
            if(track>=0 && track<songList.size()){
                Song songChecked= songList.get(track);
                if(songChecked!=null){
                    return songChecked;
                }
            }
            return null;
        }

        private Song findSong(String title){
            for (Song song:songList ){
                if(song.getTitle().equals(title)){
                    return song;
                }
            }
            return null;
        }
    }

}
