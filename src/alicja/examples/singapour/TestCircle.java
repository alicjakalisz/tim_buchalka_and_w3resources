package alicja.examples.singapour;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TestCircle {

    public static void main(String[] args) {
        TheCircleClass circle= new TheCircleClass();// using default constructor

        System.out.println("The circle has radius of: "+ circle.getRadius()+" and area of: "+ circle.getArea(10));


        TheCircleClass circle2= new TheCircleClass(10);
        TheCircleClass circle3= new TheCircleClass(10,"green");
        circle3.setColour("blue");
        System.out.println("Colour of circle3 is:"+ circle3.getColour());// one of fields printed
        System.out.println(circle3.toString());// whole object (its values attributes to be printed- need to string method


    }



}
