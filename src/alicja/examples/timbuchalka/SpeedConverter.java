package alicja.examples.timbuchalka;

public class SpeedConverter {

    public static void main(String[] args) {
        double kilometeres= 1254.54;
        printConversion(kilometeres);
    }
    public static long toMilesperHour (double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        else {
            //long milesPerHour=Math.round(kilometersPerHour/1.609);
           // return milesPerHour;
            return Math.round(kilometersPerHour/1.609);
        }
    }

    public static void printConversion (double kilometeresPerHour){
        if(kilometeresPerHour<0){
            System.out.println("Invalid value");
        }
        else{
            System.out.println(kilometeresPerHour+"km per hour is " + toMilesperHour(kilometeresPerHour)+ " miles per hour");

        }


    }
}
