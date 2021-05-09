package alicja.examples.timbuchalka.interfacedemo;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;// variable of Interaface type
        timsPhone = new DeskPhone(231654);// we are assigning object type Deskphone to this variable
        timsPhone.powerOn();
        timsPhone.callPhone(231654);
        timsPhone.answer();
        // Above we could use only use methods in Interface, if DeskPhone as more methods we could nto access them

        // now we are assinging this variable (of a type Interface ITelephone) to object of a different class
        timsPhone = new MobilePhone(24656);
        timsPhone.powerOn();
        timsPhone.callPhone(24656);
        timsPhone.answer();




    }




}
