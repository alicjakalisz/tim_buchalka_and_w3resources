package alicja.examples.timbuchalka.composition.bedroom;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Floor floor;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Floor floor, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.floor = floor;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }
    public void makingBed(){
        bed.make();
    }

    @Override
    public String toString() {
        return "Bedroom\n{" +
                "name='" + name + '\'' + "\n" +
                ", wall1=" + wall1 + "\n" +
                ", wall2=" + wall2 + "\n" +
                ", wall3=" + wall3 + "\n" +
                ", wall4=" + wall4 + "\n" +
                ", ceiling=" + ceiling + "\n" +
                ", floor=" + floor + "\n" +
                ", bed=" + bed + "\n" +
                ", lamp=" + lamp + "\n" +
                '}';
    }
}
