package alicja.examples.inheritance2;

public class Dog implements Animal  {

    //attributes

   private Integer legs;
   private String food;
   private String bark;
   private boolean flying;
   private String breed;
   private String colour;
   private String name;



    //contructors

    public Dog(Integer legs2, String breed2, String colour2, String name2){
        legs=legs2;
        food="Everything";
        bark="Hau Hau";
        flying=true;
        breed=breed2;
        colour=colour2;
        name=name2;
    }


    public Dog( String breed2, String colour2, String name2){
        legs=4;
        food="Everything";
        bark="Hau Hau";
        flying=true;
        breed=breed2;
        colour=colour2;
        name=name2;
    }



    //methods
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

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        char a = 'z';
        char singleCharacter = '\'';
        // \ is escaping the characteds
        return "Dog{" +
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
