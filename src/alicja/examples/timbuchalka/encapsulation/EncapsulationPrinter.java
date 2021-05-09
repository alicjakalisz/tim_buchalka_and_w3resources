package alicja.examples.timbuchalka.encapsulation;

public class EncapsulationPrinter {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplex;

    public EncapsulationPrinter(int tonerLevel, boolean duplex) {
        if(tonerLevel>-1 && tonerLevel<=100){
            this.tonerLevel=tonerLevel;
        }
        else{
            this.tonerLevel=-1;
        }
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = 0;// this is not what you would decide about, it s always starts with 0 pages printed
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<=100){
            if(this.tonerLevel+tonerAmount>100){
                return -1;
            }
            this.tonerLevel=tonerLevel+tonerAmount;
            return this.tonerLevel;
        }
        else{
            return -1;
        }
    }
    public int printPage(int pages){
        int pagesToprint=pages;
        if(this.duplex){
            pagesToprint=pagesToprint/2;
            System.out.println("Printing in duplex mode");
        }
        this.numberOfPagesPrinted=numberOfPagesPrinted+pagesToprint;
        return pagesToprint;
    }

    public int getNumberOfPagesPrinted(){
        return this.numberOfPagesPrinted;
    }
}
