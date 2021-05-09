package alicja.examples.timbuchalka.composition;

public class MotherBoard {
    private String model;
    private String manufacturerer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public String getModel() {
        return model;
    }

    public String getManufacturerer() {
        return manufacturerer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public MotherBoard(String model, String manufacturerer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturerer = manufacturerer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadProgram(String programName){
        System.out.println("Program "+ programName+" is now loading");
    }
}
