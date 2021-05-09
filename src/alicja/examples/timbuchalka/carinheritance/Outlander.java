package alicja.examples.timbuchalka.carinheritance;

public class Outlander extends Car1 {

    private int roadServiceMonths;

    public Outlander( int roadServiceMonths) {
        super("Outlander","4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}

