package alicja.examples.timbuchalka.playlist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //creating a few songs

        Song s1=new Song("Hej Sokoly","3.45");
        Song s2=new Song("Whisky in the Jar","3.35");
        Song s3=new Song("One","3.25");
        Song s4=new Song("Master of Puppets","1.45");
        Song s5=new Song("Fuel","6.45");
        Song s6=new Song("Majteczki w Kropeczki","43.45");

        // creaing list of songs for each album
        ArrayList<Song> a1=new ArrayList<Song>();// empty
        ArrayList<Song> a2=new ArrayList<Song>(); // empty

        a1.add(s1);
        a1.add(s2);
        a1.add(s3);
        a2.add(s4);
        a2.add(s5);
        a2.add(s6);


        //Creating albums and adding songs to them
        Album album1= new Album(a1,"Album1");
        Album album2=new Album(a2,"Album2");

        Playlist playlist= new Playlist();
        playlist.addAlbum(album1);
        playlist.addAlbum(album2);

        playlist.addSong(album1,2);
        playlist.addSong(album2,2);
        playlist.addSong(album1,0);
        playlist.addSong(album2,1);

        playlist.chooseFromMenu();
    }
}
