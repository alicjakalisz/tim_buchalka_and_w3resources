package alicja.examples.timbuchalka.composition.bedroom;

public class Lamp {
    private String style;
    private boolean hasBattery;
    private int globRating;
    private boolean on;

    public Lamp(String style, boolean hasBattery, int globRating) {
        this.style = style;
        this.hasBattery = hasBattery;
        this.globRating = globRating;
        this.on=false;
    }

    public String getStyle() {
        return style;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public void turn(){
        this.on=!on;
        if(on){
            System.out.println("lamp is turned on");
        }
        else {
            System.out.println("lamp is turned off");
        }

    }

    @Override
    public String toString() {
        return "Lamp{" +
                "style='" + style + '\'' +
                ", hasBattery=" + hasBattery +
                ", globRating=" + globRating +
                ", on=" + on +
                '}';
    }
}
