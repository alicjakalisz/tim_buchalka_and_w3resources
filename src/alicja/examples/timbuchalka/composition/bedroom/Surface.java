package alicja.examples.timbuchalka.composition.bedroom;

public class Surface {
    private int witdh;
    private int lenght;

    public Surface(int witdh, int lenght) {
        this.witdh = witdh;
        this.lenght = lenght;
    }

    public int getWitdh() {
        return witdh;
    }

    public int getLenght() {
        return lenght;
    }

    @Override
    public String toString() {
        return "Surface{" +
                "witdh=" + witdh +
                ", lenght=" + lenght +
                '}';
    }
}
