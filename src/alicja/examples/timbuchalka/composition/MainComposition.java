package alicja.examples.timbuchalka.composition;

public class MainComposition {

    public static void main(String[] args) {
        Dimensions dimensions= new Dimensions(20,20,5);
        Case theCase= new Case("220B","Dell","240",dimensions);
        Resolution nativeResolution= new Resolution(2540,1440);
        Monitor monitor= new Monitor("27inch Beast","Acer",27,nativeResolution);
        MotherBoard theMotherBoard= new MotherBoard("83-200","Asus",4,6,"v2");
        // various objects being parts of PC composition, some of them have attributes being a on objects
        PC pc= new PC(theCase,monitor,theMotherBoard);
        // now PC object is created and as a parameters in constructor he has fields being objects of composition class

        // now we want to call method drawPixel whihc is under Monitor class (Monitor object is one of the attributes of PC
        //how to access it?
       // pc.getMonitor().drawPixelAt(1500,1200,"red");
        //get Monitor is in PC object, then through get Monitor(PC;s method) to method of Monitor

        //pc.getMotherBoard().loadProgram("Windows 1.0");
        //pc.getTheCase().pressPowerButton();
        //we are accessing ulimately these functions that are in these base classes
        //but accessing them via PC object.

        //PC--> through getter method to object-attribute and then to method of this attribute
        //pc.getTheCase().pressPowerButton();
        //WE NEEDED TO COMMENT UP ALL THE METHODS ACCESSED THROUGH OBJECT AS WE CHANGGED ALL PC
        //METHODS to PRIVATE FROM PUBLIC, LEAVING ONLY POWER UP PUBLIC (power up -- start draw
        pc.powerUp();
    }
}
