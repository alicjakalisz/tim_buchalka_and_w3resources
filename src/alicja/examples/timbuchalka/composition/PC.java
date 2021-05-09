package alicja.examples.timbuchalka.composition;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }
    public void powerUp(){ // powerUp function will draw up the logo
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
        monitor.drawPixelAt(1220,500,"yellow");
    }
    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
