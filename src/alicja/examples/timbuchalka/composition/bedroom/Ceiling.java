package alicja.examples.timbuchalka.composition.bedroom;

public class Ceiling {
    private int height;
    private String paintedColor;

    public Ceiling(int height, String paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public String getPaintedColor() {
        return paintedColor;
    }

    @Override
    public String toString() {
        return "Ceiling{" +
                "height=" + height +
                ", paintedColor='" + paintedColor + '\'' +
                '}';
    }
}
