package alicja.examples.timbuchalka.carpetcostcalculator;

public class MainCalculator {

    public static void main(String[] args) {
        Floor floor= new Floor(12,15);
        Carpet carpet= new Carpet(15);
        Calculator calculator= new Calculator(floor, carpet);
        System.out.println(calculator.getTotalCost());
    }
}
