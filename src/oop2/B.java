package oop2;

import java.util.Objects;

public class B extends A {
    String y;

    public B(String x,String y ){ //, if we dont use super key word, it wants to call default constructor on the base class but there isnt one so it complaints.
        // There is only A(x) so we need to use super to call it
        super(x);
        this.y=y; // additioanl attribute for B class, X is attribute inherited from class A

        // the object created from Class B would have two attributes (one inherited and called by super constructor and one defined in this class B)
    }

    @Override
    public String toString(){
        return "B:\n \tx: "  + super.getX()+ "\n \ty: "+ y;// to call upper class (baseclass) use super.getx
    }

    @Override //
    public boolean equals(Object o) {
        if(!super.equals(o))
            return false;
        if (this == o) return true;// is this the same address of memeroy so if it is then the same object an true
        if (!(o instanceof B)) return false; // if the parameter that i am passing is not an instance of C they are not goin got be equals so false
        B c = (B) o;
        return this.y.equals(c.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(y);
    }
}
