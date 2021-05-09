package alicja.examples.timbuchalka.composition.bedroom;

public class MainBedroom {

    public static void main(String[] args) {
        Wall wall1= new Wall("East");
        Wall wall2= new Wall("West");
        Wall wall3= new Wall("South");
        Wall wall4= new Wall("North");
        Ceiling ceiling= new Ceiling(10,"green");
        Surface floorSurface= new Surface(10,5);
        Floor floor= new Floor(floorSurface,"pink");
        Bed bed= new Bed("Traditional",4,2,4,1);
        Lamp lamp= new Lamp("Energysaving",true,5);

        Bedroom bedroom=new Bedroom("MY room",wall1,wall2,wall3,wall4,ceiling,floor,bed,lamp);
        bedroom.getLamp().turn();
        bedroom.makingBed();
        //bedroom.getLamp().turn();

        System.out.println(bedroom);

    }
}
