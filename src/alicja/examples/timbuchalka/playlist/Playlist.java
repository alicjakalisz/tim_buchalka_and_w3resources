package alicja.examples.timbuchalka.playlist;

import alicja.examples.timbuchalka.SCanner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {

    private LinkedList<Song> playlist;
    private ArrayList<Album> listOfAlbums;

    public Playlist() {
        this.playlist= new LinkedList<>();
        this.listOfAlbums= new ArrayList<>();
    }

    private void printMenu(){
        System.out.println("1 - Quit\n"+
                "2 - Skip to next song\n"+
                "3- Skip backwards\n"+
                "4 - Replay current song\n"+
                "5 - remove the current song from the playlist");
    }

    public boolean addAlbum(Album album){

        return this.listOfAlbums.add(album);
    }


    public boolean addSong(Album album, int positionInAlbum){
        playlist.add(album.getListSongs().get(positionInAlbum));
        return true;
    }

    public void chooseFromMenu(){
        boolean select=true;

        Scanner scanner= new Scanner(System.in);
        ListIterator<Song> songListIterator=playlist.listIterator();
        Song currentSong=null;
        while(select){
            printMenu();
            boolean hasInt=scanner.hasNextInt();

            while(!hasInt){
                scanner.nextLine();//clearing scanner
                System.out.println("Choose menu from 1 to 5");
                hasInt=scanner.hasNextInt();
            }
            int option=scanner.nextInt();
            scanner.nextLine();
            switch(option){
                case 1:
                    System.out.println("Are you sure you want to quit? Y/N");
                    String reply=scanner.nextLine();
                    while(!reply.toLowerCase().equals("y")&& !reply.toLowerCase().equals("n")){

                        System.out.println("Y or N???");
                        reply=scanner.nextLine();
                    }
                    if(reply.toLowerCase().equals("y")){
                        System.out.println("Exit playlist");
                        select=false;
                    }
                    break;
                case 2:
                    System.out.println("Skipping to the next song");

                    if(songListIterator.hasNext()){
                        currentSong=songListIterator.next();
                        currentSong.play();
                    }
                    else{
                        System.out.println("You are at the end of the list.");
                    }
                    break;
                case 3:
                    System.out.println("Moving to the previous song");
                    if(songListIterator.hasPrevious()){
                        songListIterator.previous();
                        currentSong=songListIterator.previous();
                        songListIterator.next();
                        currentSong.play();
                    }
                    else{
                        System.out.println("You are at the beginning of the list.");
                    }
                    break;
                case 4:
                    System.out.println("Replying current song");
                    songListIterator.previous();
                    currentSong=songListIterator.next();
                    currentSong.play();
                    break;
                case 5:
                    if(currentSong!=null){
                        System.out.println("Removing "+ currentSong.getTitle()+" from the playlist");
                        songListIterator.remove();
                    }
                    else{
                        System.out.println("Play a song, so then we can remove it.");
                    }
                    break;


            }
        }



    }


}
