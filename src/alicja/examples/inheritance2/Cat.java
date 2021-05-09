package alicja.examples.inheritance2;

public class Cat implements Animal  {
    //attributes
    private Integer legs;
    private String food;
    private String bark;
    private boolean flying;
    private String breed;
    private String colour;
    private String name;

    public Cat( String food, String bark, String breed, String colour, String name) {
        this.legs = 4;// "this" is a key word which referes to current object attributes above.
        this.food = food;
        this.bark = bark;
        this.flying = false;
        this.breed = breed;
        this.colour = colour;
        this.name = name;
    }

    @Override
    public String getBark() {
        return bark;
    }

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public Integer getlegs() {
        return legs;
    }

    @Override
    public boolean isFlying() {
        return flying;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getColour() {
        return colour;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "legs=" + legs +
                ", food='" + food + '\'' +
                ", bark='" + bark + '\'' +
                ", flying=" + flying +
                ", breed='" + breed + '\'' +
                ", colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
