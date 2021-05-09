package alicja.examples.timbuchalka.playlist;

public class Song {
    private String title;
    private String duration;

    public Song(String title, String duration){
        this.title=title;
        this.duration=duration;
    }

    public String getTitle(){
        return title;
    }
    public String getDuration(){
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void play(){
        System.out.println("playing song: "+ title);
        //Thread.sleep(2000);
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
