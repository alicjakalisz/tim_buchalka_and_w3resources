package alicja.examples.timbuchalka.interfacedemo;

public class MobilePhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;
    private boolean isON= false;


    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;

    }

    // you need to type down/implement ALL of the methods from Interface which you have implemented to the class
    @Override
    public void powerOn() {
        isON=true;
        System.out.println("Mobile phone powered up");

    }

    @Override
    public void dial(int phoneNumber) {
        if(isON){
            System.out.println("Now ringing" + phoneNumber+" on mobile phone");
        }
        else{
            System.out.println("Phone is switched off");
        }


    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobile phone");
            isRinging= false; // we set it up as false as we answered so it is not ringing in this moment anymore
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber && isON){
            isRinging= true;
            System.out.println("Melody rings");
        }
        else{
            isRinging=false;
            System.out.println("Mobile phone not on or number different");
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;// field isRinging is of type boolean true or false
    }

    // wwith all thsee methods, they need to be implemented EVEN if we are not going to use all of them.
}

