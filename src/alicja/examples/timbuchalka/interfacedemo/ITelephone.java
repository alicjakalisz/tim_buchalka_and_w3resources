package alicja.examples.timbuchalka.interfacedemo;

public interface ITelephone {
// we are going to include here methods that the class that is going to use this interface needs to implement
// we are typing only SIGNATTURES of the methods (name and parameters, we are NOT defining the code itself
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();

    // you dont need to use modififer (punblic or private) as it is useless for interface
    // as that is going to be applied in the actual class
}
