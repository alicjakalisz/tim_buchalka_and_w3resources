package alicja.examples.timbuchalka.composition.bedroom;

public class Floor {

    private Surface surface;
    private String colour;

    public Floor(Surface surface, String colour) {
        this.surface = surface;
        this.colour = colour;
    }

    public Surface getSurface() {
        return surface;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "surface=" + surface +
                ", colour='" + colour + '\'' +
                '}';
    }
}
