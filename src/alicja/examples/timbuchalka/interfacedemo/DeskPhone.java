package alicja.examples.timbuchalka.interfacedemo;

public class DeskPhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;

    }

    // you need to type down/implement ALL of the methods from Interface which you have implemented to the class
    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing" + phoneNumber+" on deskphone");

    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the desk phone");
            isRinging= false; // we set it up as false as we answered so it is not ringing in this moment anymore
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber){
            System.out.println("ring ring");
            isRinging= true;
        }
        else{
            isRinging=false;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;// field isRinging is of type boolean true or false
    }

    // wwith all thsee methods, they need to be implemented EVEN if we are not going to use all of them.
}
