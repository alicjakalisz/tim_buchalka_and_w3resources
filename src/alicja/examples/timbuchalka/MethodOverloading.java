package alicja.examples.timbuchalka;

public class MethodOverloading {
    //Method Overloading is a feature that allows a class to have more than one method having the same name,
    // if their argument lists are different
    //the same name but different type of parameters or different number of paramenters or different sequence of pararements
    // return type DOES NOT MATTER in method overloading
    //implementation {} can be different!

    public static void main(String[] args) {
        System.out.println(claclFeetAndInchesToCentimeters(6,0));
        System.out.println(claclFeetAndInchesToCentimeters(100));

    }

    public static double claclFeetAndInchesToCentimeters(double feet, double inches){
        if((feet<0) || ((inches<0) || (inches>12))){
            return -1;
        }
        double centimeters;
        centimeters=(inches*2.54)+(feet*12*2.54);
        return centimeters;
    }
    public static double claclFeetAndInchesToCentimeters(double inches){
        if(inches<0){
            return -1;
        }
        double feet;
        feet=(int)inches/12;
        double remaningInches=(int)inches%12;
        return claclFeetAndInchesToCentimeters(feet, remaningInches);
    }

}
